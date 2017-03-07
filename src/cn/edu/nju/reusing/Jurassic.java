package cn.edu.nju.reusing;

/**
 * final将某类声明为final的，说明该类不被继承，该类永远不需要做任何变动
 * @author fantiantian
 *
 */
class SmallBrain {}
final class Dinosuar {
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}
public class Jurassic {
	public static void main(String[] args) {
		Dinosuar n = new Dinosuar();
		n.f();
		n.i = 40;
//		int x = n.i;
		n.j++;
		System.out.println("i = " + n.i);
		System.out.println("j = " + n.j);
	}
}
