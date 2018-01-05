package cn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.rabbitmq.sender.Send;

/**
 * @author :
 * @version 创建时间：2017年11月21日 下午5:08:23 类说明
 */
@RestController
@RequestMapping("/rabbitMQ")
public class RabbitMQController {

	@Autowired
	private Send send;

	@RequestMapping("/test")
	public void rabbitTest() {
		send.sendMsg("我的第一个消息");
	}

}
