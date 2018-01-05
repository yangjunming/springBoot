package cn.com;

/**
 * @author :
 * @version 创建时间：2018年1月2日 下午4:39:34 类说明
 */

public class MyThread extends Thread {

	private int id = 0;

	private Common common;

	public MyThread(String name, int no, Common object) {

		super(name);

		common = object;

		id = no;

	}

	public void run() {

		System.out.println("Running Thread" + this.getName());

		try {
			if (id == 0) {
				common.synchronizedMethod1();
			} else {
//				common.method1();
				common.synchronizedMethod2();
//				wait();
			}
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public static void main(String[] args) {

		Common c = new Common();

		MyThread t1 = new MyThread("MyThread-1", 0, c);

		MyThread t2 = new MyThread("MyThread-2", 1, c);

		t1.start();

		t2.start();

	}

}
