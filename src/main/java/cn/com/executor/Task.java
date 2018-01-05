package cn.com.executor;

/**
 * @author :
 * @version 创建时间：2018年1月3日 下午3:05:54 类说明
 */
public class Task implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
