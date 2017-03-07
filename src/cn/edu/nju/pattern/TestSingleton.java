package cn.edu.nju.pattern;

public class TestSingleton {
	public static void main(String[] args) {
//		Singleton s1 = Singleton.instance;
//		Singleton s2 = Singleton.instance;
		/*
		 * 饿汉模式
		 */
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("s1 和 s2是同一个实例");
		} else {
			System.out.println("s1 和 s2不是同一个实例");
		}
		
		/*
		 * 懒汉模式
		 */
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		if(s3 == s4) {
			System.out.println("s3 和 s4是同一个实例");
		} else {
			System.out.println("s3 和 s4 不是同一个实例");
		}
	}
}
