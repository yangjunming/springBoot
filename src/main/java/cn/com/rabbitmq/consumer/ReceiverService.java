package cn.com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import cn.com.rabbitmq.AmqpConfig;

@Component
//@QueueMessageListener(bindings = @QueueCustomBinding(key = "spring-boot-queue", value = @QueueCustom(deadQueue = true) ) , id = "spring-boot")
public class ReceiverService {

//	@QueueMessageHandler
	@RabbitListener(queues= AmqpConfig.DEFAULT_QUEUE)
	@RabbitHandler
	public void receiveContractQueue(String contract) {
		System.out.println(" [x] Received '1111111111111111 '"); 
//		ObjectMapper objectMapper = new ObjectMapper();
		System.out.println("Received contract-----------------<" + contract + ">");
	}

//	@RabbitListener(queues = RabbitMqQueue.CONTRACE_TENANT)
//	public void receiveTenantQueue(TenantRabbitMq tenant) {
//		ObjectMapper objectMapper = new ObjectMapper();
//		try {
//			System.out.println("Received contract<" + objectMapper.writeValueAsString(tenant) + ">");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}