package cn.edu.nju.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SyncTest {
	private int value = 0;
	Lock lock = new ReentrantLock();
	
	public synchronized void addValueSync() {
		this.value++;
		System.out.println(Thread.currentThread().getName() + ":" + value);
	}
	
	public void addValueLock() {
		try {
			lock.lock();
			value++;
			System.out.println(Thread.currentThread().getName() + ":" + value);
		} finally {
			lock.lock();
		}
	}
}
public class TestSynLock {
	public static void main(String[] args) {
		final SyncTest st = new SyncTest();
		
		/*Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<5; i++) {
					st.addValueSync();
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t1.start();*/
		
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i=0; i<5; i++) {
					st.addValueLock();
					try {
						Thread.sleep(20);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		t2.start();
	}
}
