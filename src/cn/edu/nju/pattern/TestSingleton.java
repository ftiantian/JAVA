package cn.edu.nju.pattern;

public class TestSingleton {
	public static void main(String[] args) {
//		Singleton s1 = Singleton.instance;
//		Singleton s2 = Singleton.instance;
		/*
		 * ����ģʽ
		 */
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2) {
			System.out.println("s1 �� s2��ͬһ��ʵ��");
		} else {
			System.out.println("s1 �� s2����ͬһ��ʵ��");
		}
		
		/*
		 * ����ģʽ
		 */
		Singleton2 s3 = Singleton2.getInstance();
		Singleton2 s4 = Singleton2.getInstance();
		if(s3 == s4) {
			System.out.println("s3 �� s4��ͬһ��ʵ��");
		} else {
			System.out.println("s3 �� s4 ����ͬһ��ʵ��");
		}
	}
}
