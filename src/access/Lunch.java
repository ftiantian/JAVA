package access;

class Soup1 {
	private Soup1() {}
	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

//ʹ�õ��˵���ģʽ����Ϊ����ֻ�ܴ���һ��ʵ�������췽����˽�е�
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
