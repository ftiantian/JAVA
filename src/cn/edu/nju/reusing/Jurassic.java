package cn.edu.nju.reusing;

/**
 * final��ĳ������Ϊfinal�ģ�˵�����಻���̳У�������Զ����Ҫ���κα䶯
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
