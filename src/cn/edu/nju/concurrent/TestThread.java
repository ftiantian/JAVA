package cn.edu.nju.concurrent;

class MyThread extends Thread {
	public void run() {
		System.out.println("Thread body");
	}
}
public class TestThread {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		System.out.println("main thread end!");
	}
}
