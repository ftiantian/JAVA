package access;

class Soup1 {
	private Soup1() {}
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

//使用到了单例模式，因为这里只能创建一个实例，构造方法是私有的
class Soup2 {
	private Soup2() {}
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access() {
		return ps1;
	}
	public void f() {}
}

public class Lunch {
	void testPrivate() {
//		Soup1 soup1 = new Soup1();
	}
	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
	}
	void testSingleton() {
		Soup2.access().f();
		
//		Soup2 soup2 = new Soup2();
	}
}
