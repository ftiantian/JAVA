package cn.edu.nju.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 根据优先级执行程序
 * @author fantiantian
 *
 */
public class SimplePriorities implements Runnable {
	private int countDown = 5;
	private volatile double d;//volatile修饰的没有优先级
	private int priority;
	
	public SimplePriorities(int priority) {
		this.priority = priority;
	}
	
	public String toString() {
		return Thread.currentThread() + ": " + countDown;
	}
	
	public void run() {
		Thread.currentThread().setPriority(priority);
		while(true) {
			for(int i=1; i<100000; i++) {
				d += (Math.PI+Math.E) / (double)i;
				if(i % 1000 == 0)
					Thread.yield();
			}
			System.out.println(this);
			if(--countDown == 0)
				return;
		}
	}
	
	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0; i<5; i++)
			exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		System.out.println("执行...");
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		exec.shutdown();
	}
}
