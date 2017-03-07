package cn.edu.nju.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {
	public static class CallableTest implements Callable<String> {
		public String call() throws Exception {
			return "Hello World!";
		}
	}
	
	public static void main(String[] args) {
		ExecutorService threadPool = Executors.newSingleThreadExecutor();
		
		//�����߳�,submit�еĲ�������call������call�����ķ���ֵ���ظ�submit����
		Future<String> future = threadPool.submit(new CallableTest());
		
		try {
			System.out.println("waiting thread to finish.");
			System.out.println(future.get());//�ȴ��߳̽��������ؽ��
			System.out.println("finishing");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
