package cn.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.Bean.User;
import cn.com.mapper.UserMapper;
import cn.com.service.UserService;

/**
 * @author :
 * @version 创建时间：2017年11月15日 下午2:45:48 类说明
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getByUserid(int userId) {
		User user = userMapper.getByUserid(userId);
		return user;
	}

}
