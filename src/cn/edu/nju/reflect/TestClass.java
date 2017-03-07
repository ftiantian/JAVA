package cn.edu.nju.reflect;

//���Ƕ�������java.lang.Class���ʵ������
public class TestClass {
	public static void main(String[] args) throws Exception{
		Foo foo1 = new Foo();
//		Foo��Ҳ��һ��ʵ��������Class���ʵ������
//		�κ�һ���඼��Class��ʵ���������ʵ�����������ֱ�﷽ʽ
//		��һ�ֱ�﷽ʽ
		Class c1 = Foo.class;
//		�ڶ���
		Class c2 = foo1.getClass();
//		c1 c2��ʾ��Foo��������ͣ���������Զ�����Ҳ�Ƕ�����Class��ʵ������
		System.out.println(c1 == c2);
//		System.out.println(c1.);
		Class c3 = null;
		c3 = Class.forName("cn.edu.nju.reflect.Foo");
		System.out.println(c2 == c3);
		
//		ͨ������������������Ķ���
		Foo foo2 = (Foo)c1.newInstance();
		foo2.print();
	}
}

class Foo {
	void print() {
		System.out.println("Foo��");
	}
}