package cn.com.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author :
 * @version 创建时间：2018年1月4日 下午4:37:48 类说明
 */
public class CglibProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method method, Object[] arg, MethodProxy proxy) throws Throwable {
		System.out.println("-------=====before");
		proxy.invokeSuper(object, arg);
		System.out.println("-------=====after");
		return null;
	}

	// System.out.println("-------=====before");
	// System.out.println("-------=====after");

}
