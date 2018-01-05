package cn.com.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author :
 * @version 创建时间：2018年1月3日 下午3:02:47 java线程池
 */
public class ExecutorCase {

	private static Executor exector = Executors.newFixedThreadPool(10);
	private static ExecutorService exector1 = Executors.newFixedThreadPool(10);
	int threadPoolExecutor = new ThreadPoolExecutor(1, 1, 100L, TimeUnit.MILLISECONDS,
			new LinkedBlockingQueue<Runnable>()).prestartAllCoreThreads();

	Future<String> future = (Future<String>) exector1.submit(new Task());
	
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			exector.execute(new Task());
		}
	}
	
//	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
//		
//	}
}
