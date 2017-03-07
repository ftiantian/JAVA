package cn.edu.nju.reusing;

/**
 * final参数：在参数列表中以声明的方式将参数指明为final,
 * 意味着无法在方法中更改参数引用所指的对象
 * 这一特点不是很理解
 * @author fantiantian
 *
 */
class Gizmo {
	public void spin() {
		System.out.println("调用spin()");
	}
}
public class FinalArguments {
	void with(final Gizmo g) {
		//!不能这样做，因为g是final
//		g = new Gizmo();
	}
	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}
	void f(final int i) {
		//!因为i是final的，所以不能改变i的值
		//i++;
	}
	int g(final int i) {
		return i+1;
	}
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
//		bf.without(new Gizmo());
		bf.without(null);
		System.out.println("结束调用without()");
//		bf.with(new Gizmo());
		bf.with(null);
		System.out.println("结束调用with()");
	}
}
