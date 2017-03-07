package cn.edu.nju.concurrency;

public class BasicThreads {
	public static void main(String[] args) {
		//Thread t线程是一个新的线程，所以该方法中有两个线程，那就是t线程和main线程
		Thread t = new Thread(new LiftOff());
		System.out.println("Starting for LiftOff");
		t.start();
		System.out.println("Waiting for LiftOff");
		System.out.println("ending for LiftOff");
	}
}
