package cn.com.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.com.Bean.Demo;
import cn.com.Bean.User;
import cn.com.mapper.UserMapper;
import cn.com.service.RedisService;
import cn.com.service.UserService;

/**
 * @author :
 * @version 创建时间：2017年3月14日 上午11:06:23 类说明
 */
@RestController
public class HelloWorld {
	@Autowired
	private UserService userService;
	@Autowired
	private RedisService redisService;

	@RequestMapping("/hello")
	public Object hello() {
		int ss = 4561214;
		return ss;
	}

	@RequestMapping("/hello4")
	public Object hello4() {
		int ss = 456121;
		return ss;
	}

	@RequestMapping("/getDemo1")
	@ResponseBody
	public Demo getDemo() {
		Demo demo = new Demo();
		demo.setId(112);
		demo.setName("张二娃1");
		demo.setCreaDate(new Date());
		return demo;
	}

	@RequestMapping("/hello2")
	public Object hello2() {
		return "123";
	}

	@RequestMapping("/hello3")
	public Object hello3() {
		return "123444";

	}

	@RequestMapping("/getUser")
	public User getUser() {
		return userService.getByUserid(1);
	}

	@RequestMapping("/getStringByRedis")
	public Object getStringByRedis() {
		String s = redisService.getStr("mykey");
		return s;
	}

	@RequestMapping("/getUserById/{userId}")
	public User getUserByUserId(@PathVariable Integer userId) {
		return redisService.getUser(userId);
	}

}
