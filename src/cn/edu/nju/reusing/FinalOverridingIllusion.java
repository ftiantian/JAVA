package cn.edu.nju.reusing;

/**
 * final方法，final和private关键字,这一块内容不是很理解
 * @author fantiantian
 *
 */
class WithFinals {
	private final void f() {
		System.out.println("WithFinals.f()");
	}
	private void g() {
		System.out.println("WithFinals.g()");
	}
}

class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverridingPrivate.f()");
	}
	private void g() {
		System.out.println("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	public void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}
public class FinalOverridingIllusion {
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		//可以向上转型，但是不能调用对应的方法
		OverridingPrivate op = op2;
		//!op.f();
		//!op.g();
		WithFinals wf = op2;
		//!wf.f();
		//!wf.g();
	}
}
