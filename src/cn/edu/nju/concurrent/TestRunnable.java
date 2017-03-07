package cn.edu.nju.concurrent;

class MyThread2 implements Runnable {
	public void run() {
		System.out.println("runnable thread body...");
	}
}
public class TestRunnable {
	public static void main(String[] args) {
		MyThread2 t = new MyThread2();
		Thread thread = new Thread(t);
		thread.start();
		System.out.println("test run...");
		t.run();
		System.out.println("main thread end...");
	}
}
