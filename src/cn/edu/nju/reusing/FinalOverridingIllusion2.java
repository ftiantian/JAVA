package cn.edu.nju.reusing;

class WithFinals2 {
	private final void f() {
		System.out.println("WithFinals2.f()");
	}
	
	private void g() {
		System.out.println("WithFinals2.g()");
	}
}

class OverridingPrivate22 extends WithFinals2 {
	private final void f() {
		System.out.println("OverridingPrivate2.f()");
	}
	
	private void g() {
		System.out.println("OverridingPrivate2.g()");
	}
}

class OveridingPrivate222 extends OverridingPrivate22 {
	public final void f() {
		System.out.println("OveridingPrivate222.f()");
	} 
	
	public void g() {
		System.out.println("OveridingPrivate222.g()");
	}
}

class OveridingPrivate3 extends OveridingPrivate222 {
	/*public final void f() {
		System.out.println("overingPrivate3.f()");
	}*/
}

public class FinalOverridingIllusion2 {
	public static void main(String[] args) {
		//WithFinals2 wf = new WithFinals2();
		//OverridingPrivate22 op = new OverridingPrivate22();
		OveridingPrivate222 op = new OveridingPrivate222();
		op.f();
		op.g();
	}
}
