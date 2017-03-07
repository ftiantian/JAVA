package cn.edu.nju.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class T implements Runnable {
	public void run() {
		System.out.println("execute runnable...");
	}
}

public class TestThreadPool {
	public static void main(String[] args) {
		//一般使用这个线程池，可以根据需要调整线程池的大小
		//ExecutorService e = Executors.newCachedThreadPool();
		//单线程池，所有线程依次排队执行，不会穿插，按照顺序执行
//		ExecutorService e = Executors.newSingleThreadExecutor();
		ExecutorService e = Executors.newFixedThreadPool(6);
		//e.execute(new T());
		for(int i=0; i<5; i++) {
			e.execute(new T());
		}
		System.out.println("main thread end...");
	}
}
