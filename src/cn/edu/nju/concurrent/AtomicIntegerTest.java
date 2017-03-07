package cn.edu.nju.concurrent;

import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerTest {
//	static AtomicInteger ai = new AtomicInteger(1);
	static int[] value = new int[] {1,2,3};
	static AtomicIntegerArray ai = new AtomicIntegerArray(value);
	
	public static void main(String[] args) {
		//System.out.println(ai.getAndIncrement());
		//System.out.println(ai.incrementAndGet());
		//System.out.println(ai.get());
		//System.out.println(ai.getAndSet(3));
		//System.out.println(ai.compareAndSet(4, 5));
		//System.out.println(ai.get());
		
		ai.getAndSet(1, 4);
		System.out.println(ai.get(1));
		System.out.println(ai.compareAndSet(2, 3, 5));
		System.out.println(ai.get(2));
	}
}
