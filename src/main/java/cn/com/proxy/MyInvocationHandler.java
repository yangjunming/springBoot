package cn.com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author :
 * @version 创建时间：2018年1月4日 下午4:03:40 类说明
 */
public class MyInvocationHandler implements InvocationHandler {

	private Object target;

	MyInvocationHandler() {
		super();
	}

	MyInvocationHandler(Object target) {
		super();
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("-----------------before");
		Object result = method.invoke(target, args);
		System.out.println("================after");
		
		return result;
	}

}
