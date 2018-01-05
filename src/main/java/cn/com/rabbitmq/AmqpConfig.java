package cn.com.rabbitmq;

import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.amqp.support.converter.SimpleMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import cn.com.RabbitMq;
import groovy.util.logging.Slf4j;

@Configuration
@EnableRabbit
@Slf4j
public class AmqpConfig {

	// private Logger log = (Logger) LoggerFactory.getLogger(AmqpConfig.class);

	public static final String EXCHANGE = "spring-boot-exchange";
	public static final String ROUTINGKEY = "spring-boot-routingKey";
	public static final String DEFAULT_QUEUE = "spring-boot-queue";

	@Autowired
	private RabbitMq rabbitMq;
	
	
	@Bean(name = "simpleRabbitListenerContainerFactory")
	SimpleRabbitListenerContainerFactory createSimpleRabbitListenerContainerFactory(
			@Qualifier(value = "messageConverter") MessageConverter messageConverter,
			@Qualifier(value = "connectionFactory") ConnectionFactory connectionFactory) {

		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
		factory.setConnectionFactory(connectionFactory);// 连接工厂
		factory.setMessageConverter(messageConverter);// 转换器
		factory.setDefaultRequeueRejected(false);// 可以重新返回队列
		factory.setAcknowledgeMode(AcknowledgeMode.MANUAL);// 手动
		return factory;
	}

	/**
	 * 连接rabbitmq
	 * 
	 * @return
	 */
	
	@Bean(name = "connectionFactory")
	public ConnectionFactory connectionFactory() {
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
		connectionFactory.setAddresses(rabbitMq.getAddresses());
		connectionFactory.setUsername(rabbitMq.getUsername());
		connectionFactory.setPassword(rabbitMq.getPassword());
		/**
		 * 对于每一个RabbitTemplate只支持一个ReturnCallback。
		 * 对于返回消息，模板的mandatory属性必须被设定为true，
		 * 它同样要求CachingConnectionFactory的publisherReturns属性被设定为true。
		 * 如果客户端通过调用setReturnCallback(ReturnCallback
		 * callback)注册了RabbitTemplate.ReturnCallback，那么返回将被发送到客户端。
		 * 这个回调函数必须实现下列方法： void returnedMessage(Message message, intreplyCode,
		 * String replyText,String exchange, String routingKey);
		 */
		// connectionFactory.setPublisherReturns(true);
		/**
		 * 同样一个RabbitTemplate只支持一个ConfirmCallback。
		 * 对于发布确认，template要求CachingConnectionFactory的publisherConfirms属性设置为true。
		 * 如果客户端通过setConfirmCallback(ConfirmCallback
		 * callback)注册了RabbitTemplate.ConfirmCallback，那么确认消息将被发送到客户端。
		 * 这个回调函数必须实现以下方法： void confirm(CorrelationData correlationData,
		 * booleanack);
		 */
		connectionFactory.setPublisherConfirms(rabbitMq.getPublisherconfirms());
		return connectionFactory;
	}

	@Bean(name = "messageConverter")
	MessageConverter createMessageConverter() {
		return new SimpleMessageConverter();
	}

	/**
	 * rabbitAdmin代理类
	 * 
	 * @return
	 */
	@Bean(name = "rabbitAdmin")
	public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
		return new RabbitAdmin(connectionFactory);
	}

	/**
	 * 创建rabbitTemplate 消息模板类 prototype原型模式:每次获取Bean的时候会有一个新的实例
	 * 因为要设置回调类，所以应是prototype类型，如果是singleton类型，则回调类为最后一次设置
	 * 
	 * @return
	 */
	@Bean(name = "rabbitTemplate")
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public RabbitTemplate rabbitTemplate() {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory());
		// rabbitTemplate.setMandatory(true);//返回消息必须设置为true
		rabbitTemplate.setMessageConverter(new SimpleMessageConverter());
		// rabbitTemplate.setReplyAddress(replyQueue().getName());
		// rabbitTemplate.setReplyTimeout(100000000);
		// 发布确认
		rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
			// 消息发送到queue时就执行
			@Override
			public void confirm(CorrelationData correlationData, boolean b, String s) {
				// log.debug(correlationData + "//////");
				if (!b) {
					// log.debug("发送到queue失败");
					throw new RuntimeException("send error " + s);
				}
			}
		});
		return rabbitTemplate;
	}
	

	@Bean
	public Queue queue() {
		return new Queue("spring-boot-queue", true);
	}

	 @Bean
	 public Binding binding() {
	 return
	 BindingBuilder.bind(queue()).to(defaultExchange()).with(ROUTINGKEY);
	 }

	/**
	 * 针对消费者配置 FanoutExchange: 将消息分发到所有的绑定队列，无routingkey的概念 HeadersExchange
	 * ：通过添加属性key-value匹配 DirectExchange:按照routingkey分发到指定队列
	 * TopicExchange:多关键字匹配
	 */
	 @Bean
	 public DirectExchange defaultExchange() {
	 return new DirectExchange(EXCHANGE);
	 }
	
}