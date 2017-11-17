package cn.com.service;

import cn.com.Bean.User;

/**
* @author :
* @version 创建时间：2017年11月16日 下午4:25:11
* 类说明
*/
public interface RedisService {
	
	public String getStr(String key);
	
	public void serStr(String key, String val);
	
	public void del(String key);
	
	public Object getObj(Object o);
	
	public void setObj(Object o1,Object o2);
	
	public void delObj(Object o);
	
	public User getUser(int userId);

}
