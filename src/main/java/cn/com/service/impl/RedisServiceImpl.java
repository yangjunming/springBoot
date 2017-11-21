package cn.com.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
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
	private RedisTemplate<String, String> redisTemplateString;

	@Resource(name = "redisTemplate")
	private ValueOperations<Object, User> valOpsObj;

	@Resource(name = "redisTemplate")
	private HashOperations<String, String, User> hashOperations;
	@Autowired
	private UserService userService;

	private static final String USER_LOCK = "user_lock:";

	@Override
	public String getStr(String key) {
		ValueOperations<String, String> valueOps = redisTemplateString.opsForValue();
		valueOps.increment("18101031947", 1);
		String value = (String) valueOps.get(key);
		if (StringUtils.isEmpty(value)) {
			valueOps.set(key, "18101031947");
		}
		return value;
	}

	@Override
	public void serStr(String key, String val) {
		// valOpsStr.set(key, val);

	}

	@Override
	public void del(String key) {
		// stringRedisTemplate.delete(key);
	}

	@Override
	public Object getObj(Object o) {
		return null;
	}

	@Override
	public void setObj(Object o1, Object o2) {
		// valOpsObj.set(o1, o2);

	}

	@Override
	public void delObj(Object o) {
		// redisTemplate.delete(o);

	}

	@Override
	public User getUser(int userId) {
		// HashOperations<String, String, User> valueOps =
		// redisTemplate.opsForHash();
		// ListOperations<K, V>
		// ZSetOperations<K, V>
		// SetOperations<K, V>
		// boolean f = getLock(userId);
		// if(f){
		User user = (User) hashOperations.get("USER:" + userId, String.valueOf(userId));
		if (null == user) {
			user = userService.getByUserid(userId);
			if (null != user) {
				// hashOperations.put("USER:" + user.getUserId(),
				// String.valueOf(user.getUserId()), user);
				Map<String, User> map = new HashMap<String, User>();
				map.put(String.valueOf(user.getUserId()), user);
				hashOperations.putAll("USER:" + user.getUserId(), map);
			}
		}
		return user;
		// }
		// return new User();
	}

	/**
	 * 加锁
	 * 
	 * @return
	 */
	@Deprecated
	private boolean getLock(int userId) {
		ValueOperations<String, String> valueOps = redisTemplateString.opsForValue();
		boolean f = valueOps.setIfAbsent(USER_LOCK + userId, "locked");
		if (f) {
			redisTemplateString.expire(USER_LOCK + userId, 10, TimeUnit.SECONDS);
			return f;
		}
		return false;
	}

}
