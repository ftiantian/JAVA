package cn.edu.nju.reusing;

/**
 * final�հ�ֵ��final����ֵ�ڶ��崦û�б���ʼ����
 * finalֵ��������Ķ��崦������ÿ�����������ñ��ʽ��final���и�ֵ
 * @author fantiantian
 *
 */
class Popet {
	private int i;
	Popet(int ii) {
		i = ii;
	}
}
public class BlankFinal {
	private final int i = 0;
	private final int j;
	private Popet p;
	
	public BlankFinal() {
		//��ʼ��finalֵ
		j = 1;
		p = new Popet(1);
		System.out.println("j = " + j);
//		System.out.println("p = " + p.i);
	}
	
	public BlankFinal(int x) {
		//��ʼ��finalֵ
		j = x;
		p = new Popet(x);
//		System.out.println("j = " + j);
	}
	
	public static void main(String[] args) {
		new BlankFinal();
//		System.out.println("j = " + j);
		new BlankFinal(47);
	}
}
