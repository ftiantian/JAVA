package cn.edu.nju.JavaConcurrency;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * ���н������Atomic�Ľ��һֱ��1001��valatile�Ľ�����
 * @author fantiantian
 *
 */
public class AtomicIntegerTest {
	public final static AtomicInteger TEST_INTEGER = new AtomicInteger(1);
	private static int index = 1;
	
	public static void main(String[] args) throws InterruptedException {
		final CountDownLatch startCountDown = new CountDownLatch(1);
		final Thread []threads = new Thread[10];
		
		for(int i=0; i<10; i++) {
			threads[i] = new Thread() {
				public void run() {
					try {
						startCountDown.await();
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
					
					for(int j=0; j<100; j++) {
						index++;
						TEST_INTEGER.incrementAndGet();
					}
				}
			};
			threads[i].start();
		}
		Thread.sleep(1000);
		startCountDown.countDown();
		for(Thread t : threads) {
			t.join();
		}
		
		System.out.println("Atomic�������еĽ����" + TEST_INTEGER.get());
		System.out.println("valatile�������н����" + index);
	}
}
