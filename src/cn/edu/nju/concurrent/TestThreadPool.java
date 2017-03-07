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
		//һ��ʹ������̳߳أ����Ը�����Ҫ�����̳߳صĴ�С
		//ExecutorService e = Executors.newCachedThreadPool();
		//���̳߳أ������߳������Ŷ�ִ�У����ᴩ�壬����˳��ִ��
//		ExecutorService e = Executors.newSingleThreadExecutor();
		ExecutorService e = Executors.newFixedThreadPool(6);
		//e.execute(new T());
		for(int i=0; i<5; i++) {
			e.execute(new T());
		}
		System.out.println("main thread end...");
	}
}
