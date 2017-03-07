package test;

class Base {
	public Base() {
		System.out.println("Base()");
	}
}

class Sub extends Base {
	public Sub() {
		super();
		System.out.println("Sub()");
	}
}
public class TestSuper {
	public static void main(String[] args) {
		Sub sub = new Sub();
	}
}
