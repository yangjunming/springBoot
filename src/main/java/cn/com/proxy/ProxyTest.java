package cn.com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.aop.support.AopUtils;

import cn.com.proxy.impl.AServiceImpl;

/**
 * @author :
 * @version 创建时间：2018年1月4日 下午4:09:19 类说明
 */
public class ProxyTest {

	public static void main(String[] args) {
		
		AService aService = new AServiceImpl();
		
		MyInvocationHandler handler = new MyInvocationHandler(aService);
		
		AService serviceProxy = (AService)Proxy.newProxyInstance(aService.getClass().getClassLoader(), aService.getClass().getInterfaces(),
				handler);
	    Method[] c = AopUtils.getTargetClass(serviceProxy).getMethods();
	    for (Method method : c) {
	    	System.out.println(method);
		}
	    
	    
//	    InvocationHandler invo = Proxy.getInvocationHandler(serviceProxy);
//	    AServiceImpl aServiceImpl = (AServiceImpl) new DirectFieldAccessor(serviceProxy).getPropertyValue("advised");
//	    Class clazz = serviceProxy.getTargetClass();
	    
	    System.out.println(c);
	    if(AopUtils.isAopProxy(serviceProxy)){
			System.out.println("------AOP");
		}
		if(AopUtils.isJdkDynamicProxy(serviceProxy)){
			System.out.println("------AOP");
		}
		if(AopUtils.isCglibProxy(serviceProxy)){
			System.out.println("------CgLib");
		}
		serviceProxy.add();
//		serviceProxy.update();
		
		CglibProxy proxy = new CglibProxy();
		
		AServiceImpl aServiceImpl = Factory.getInstance(proxy);
		

		Class<?> a = AopUtils.getTargetClass(aServiceImpl);
		System.out.println(a);
		if(AopUtils.isAopProxy(aServiceImpl)){
			System.out.println("------AOP");
		}
		if(AopUtils.isJdkDynamicProxy(aServiceImpl)){
			System.out.println("------AOP");
		}
		if(AopUtils.isCglibProxy(aServiceImpl)){
			System.out.println("------CgLib");
		}
		aServiceImpl.add();
		
		
	
	}

}
