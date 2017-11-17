package cn.com.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;

import cn.com.Bean.User;
import cn.com.service.RedisService;
import cn.com.service.UserService;

/**
 * @author :
 * @version 创建时间：2017年11月16日 下午4:25:34 类说明
 */
@Service
public class RedisServiceImpl implements RedisService {
	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	@Autowired
	private RedisTemplate<String, String> redisTemplateString;

	@Resource(name = "stringRedisTemplate")
	private ValueOperations<String, String> valOpsStr;

	@Resource(name = "redisTemplate")
	private ValueOperations<Object, Object> valOpsObj;
	@Autowired
	private UserService userService;

	@Override
	public String getStr(String key) {
		ValueOperations<String, String> valueOps = redisTemplateString.opsForValue();
		// long s = valueOps.increment("18101031947", 1);
		String value = (String) valueOps.get(key);
		if (StringUtils.isEmpty(value)) {
			valueOps.set(key, "18101031947");
		}
		return value;
	}

	@Override
	public void serStr(String key, String val) {
		valOpsStr.set(key, val);

	}

	@Override
	public void del(String key) {
		stringRedisTemplate.delete(key);
	}

	@Override
	public Object getObj(Object o) {
		return valOpsObj.get(o);
	}

	@Override
	public void setObj(Object o1, Object o2) {
		valOpsObj.set(o1, o2);

	}

	@Override
	public void delObj(Object o) {
		redisTemplate.delete(o);

	}

	@Override
	public User getUser(int userId) {
		User user = (User) valOpsObj.get(userId);
		if (null != user) {
			user = userService.getByUserid(userId);
			valOpsObj.set(userId, user);
		}
		return user;
	}

}
