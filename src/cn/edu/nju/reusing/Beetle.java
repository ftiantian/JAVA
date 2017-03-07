package cn.edu.nju.reusing;

/**
 * 继承与初始化
 * 1.先加载基类中的静态变量，然后再加载继承类中的静态变量
 * 2.加载基类中的构造方法，加载继承类中的构造方法
 * 3.加载基类中的非静态变量，然后加载继承类中的非静态变量
 * 
 * @author fantiantian
 *
 */
class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		System.out.println("i = " + i + "j = " + j);
		j = 39;
	}
	private static int x1 = printInit("static Insect.x1 initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	public static int x2 = printInit("static Beetle.x2 initialized");
	public static void main(String[] args) {
		System.out.println();
		Beetle b = new Beetle();
	}
}
