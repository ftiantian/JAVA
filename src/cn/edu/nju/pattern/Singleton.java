package cn.edu.nju.pattern;

/**
 * 
 * @author fantiantian
 *
 */
/*
 * 单例模式
 * 应用场景：有些对象只需要一个就够了
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式、懒汉模式
 * 这里是饿汉模式
 */
public class Singleton {
//	1.将构造方法私有化，不允许外界直接创建对象
	private Singleton() {
		
	}
	
//	2.创建类的唯一实例，自己调用构造方法创建实例
//	使用private static 来修饰实例，成静态
	private static Singleton instance = new Singleton();
	
//	3.提供一个用于获取实例的方法，用public static 来修饰该方法
	public static Singleton getInstance() {
		return instance;
	}
	
}
