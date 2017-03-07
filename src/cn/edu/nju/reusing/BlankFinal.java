package cn.edu.nju.reusing;

/**
 * final空白值，final类型值在定义处没有被初始化，
 * final值必须在域的定义处或者在每个构造器中用表达式对final进行赋值
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
		//初始化final值
		j = 1;
		p = new Popet(1);
		System.out.println("j = " + j);
//		System.out.println("p = " + p.i);
	}
	
	public BlankFinal(int x) {
		//初始化final值
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
