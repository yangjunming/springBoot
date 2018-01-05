package cn.com;

/**
 * @author :
 * @version 创建时间：2018年1月2日 下午3:41:00 类说明
 */

public class Common {

	public synchronized void synchronizedMethod1() {

		System.out.println("synchronizedMethod1 called");

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		System.out.println("synchronizedMethod1 done");

	}

	public void method1() {

		System.out.println("Method 1 called");

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		System.out.println("Method 1 done");

	}

	public synchronized void synchronizedMethod2() {

		System.out.println("synchronizedMethod2 called");

		try {

			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		System.out.println("synchronizedMethod2 done");

	}

}
