package cn.edu.nju.reusing;

/**
 * final�������ڲ����б����������ķ�ʽ������ָ��Ϊfinal,
 * ��ζ���޷��ڷ����и��Ĳ���������ָ�Ķ���
 * ��һ�ص㲻�Ǻ����
 * @author fantiantian
 *
 */
class Gizmo {
	public void spin() {
		System.out.println("����spin()");
	}
}
public class FinalArguments {
	void with(final Gizmo g) {
		//!��������������Ϊg��final
//		g = new Gizmo();
	}
	void without(Gizmo g) {
		g = new Gizmo();
		g.spin();
	}
	void f(final int i) {
		//!��Ϊi��final�ģ����Բ��ܸı�i��ֵ
		//i++;
	}
	int g(final int i) {
		return i+1;
	}
	public static void main(String[] args) {
		FinalArguments bf = new FinalArguments();
//		bf.without(new Gizmo());
		bf.without(null);
		System.out.println("��������without()");
//		bf.with(new Gizmo());
		bf.with(null);
		System.out.println("��������with()");
	}
}
