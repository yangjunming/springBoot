package cn.com.rabbitmq.sender;

import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate.ConfirmCallback;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.com.Bean.QueueMessageEvent;
import cn.com.rabbitmq.AmqpConfig;
import cn.com.utils.SerializeUtils;

@Component
public class Send implements ConfirmCallback {

	@Resource(name = "rabbitTemplate")
	private RabbitTemplate rabbitTemplate;

	public void sendMsg(String content) {
		CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
		QueueMessageEvent queueMessageEvent = buildAndSaveEvent(content, null, null, null);
		rabbitTemplate.convertAndSend(AmqpConfig.EXCHANGE, AmqpConfig.ROUTINGKEY, queueMessageEvent.getMessageBody(),
				correlationId);
	}
	
	/**
	 * 回调
	 */
	@Override
	public void confirm(CorrelationData correlationData, boolean ack, String cause) {
		System.out.println(" 回调id:" + correlationData);
		if (ack) {
			System.out.println("消息成功消费");
		} else {
			System.out.println("消息消费失败:" + cause);
		}
	}

	public QueueMessageEvent buildAndSaveEvent(Object messageBody, String exchange, String routingKey,
			String uniqueKey) {
		QueueMessageEvent event = new QueueMessageEvent();
		event.setMessageBody(messageBody);
		event.setSerializeMessage(SerializeUtils.serialize(messageBody));
		event.setRoutingKey(routingKey);
		event.setUniqueKey(uniqueKey);
		// event.setMessageLevel(1);
		event.setCreatetime(new Date());
		event.setExchange(exchange);
		return event;
	}

}