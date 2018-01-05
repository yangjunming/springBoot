package cn.com.proxy;

import org.springframework.cglib.proxy.Enhancer;

import cn.com.proxy.impl.AServiceImpl;

/**
 * @author :
 * @version 创建时间：2018年1月4日 下午4:40:54 类说明
 */
public class Factory {

	public static AServiceImpl getInstance(CglibProxy proxy) {

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(AServiceImpl.class);
		enhancer.setCallback(proxy);
		AServiceImpl aServiceImpl = (AServiceImpl) enhancer.create();
		return aServiceImpl;

	}

}
