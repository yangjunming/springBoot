//package cn.com.rabbitmq.consumer;
//
//import org.springframework.amqp.core.AcknowledgeMode;
//import org.springframework.amqp.rabbit.annotation.EnableRabbit;
//import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
//import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
//import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.converter.MappingJackson2MessageConverter;
//import org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory;
//
//@Configuration
//@EnableRabbit
//public class ConsumerConfig implements RabbitListenerConfigurer {
//
//	@Autowired
//	ReceiverService receiverService;
//	@Autowired
//	private ConnectionFactory connectionFactory;
//
//	@Bean
//	public DefaultMessageHandlerMethodFactory handlerMethodFactory() {
//		DefaultMessageHandlerMethodFactory factory = new DefaultMessageHandlerMethodFactory();
//		factory.setMessageConverter(new MappingJackson2MessageConverter());
//		return factory;
//	}
//
//	// @Bean
//	// public SimpleMessageListenerContainer messageContainer() {
//	// SimpleMessageListenerContainer container = new
//	// SimpleMessageListenerContainer(connectionFactory());
//	// container.setQueues(queueContract());
//	// // container.setExposeListenerChannel(true);
//	// container.setMaxConcurrentConsumers(1);
//	// container.setConcurrentConsumers(1);
//	// container.setAcknowledgeMode(AcknowledgeMode.MANUAL); //设置确认模式手工确认
//	// container.setMessageListener(new MessageListener() {
//	//
//	// @Override
//	// public void onMessage(Message message) {
//	// byte[] body = message.getBody();
//	// System.out.println("receive msg : " + new String(body));
//	// // channel.basicAck(message.getMessageProperties().getDeliveryTag(),
//	// false); //确认消息成功消费
//	// }
//	// });
//	// return container;
//	// }
//	
//	@Bean
//	public SimpleRabbitListenerContainerFactory rabbitListenerContainerFactory() {
//		SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
//		factory.setConnectionFactory(connectionFactory);
//		factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
//		return factory;
//	}
//
//	@Override
//	public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {
//		rabbitListenerEndpointRegistrar.setMessageHandlerMethodFactory(handlerMethodFactory());
//	}
//}