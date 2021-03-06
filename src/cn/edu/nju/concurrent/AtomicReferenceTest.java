package cn.edu.nju.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {
	static class User {
		private String name;
		private int old;
		
		public User(String name, int old) {
			this.name = name;
			this.old = old;
		}
		
		public String getName() {
			return name;
		}
		
		public int getOld() {
			return old;
		}
	}
	
	public static AtomicReference<User> atomicUserRef = new AtomicReference<User>();
	
	public static void main(String[] args) {
		User user = new User("ftt", 24);
		atomicUserRef.set(user);
		User updateUser = new User("fff", 18);
		atomicUserRef.compareAndSet(user, updateUser);
		System.out.println(atomicUserRef.get().getName());
		System.out.println(atomicUserRef.get().getOld());
		
		ConcurrentHashMap m = new ConcurrentHashMap();
		
		
	}
}
