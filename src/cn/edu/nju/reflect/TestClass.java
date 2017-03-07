package cn.edu.nju.reflect;

//类是对象，类是java.lang.Class类的实例对象
public class TestClass {
	public static void main(String[] args) throws Exception{
		Foo foo1 = new Foo();
//		Foo类也是一个实例对象，是Class类的实例对象
//		任何一个类都是Class的实例对象，这个实例对象有三种表达方式
//		第一种表达方式
		Class c1 = Foo.class;
//		第二种
		Class c2 = foo1.getClass();
//		c1 c2表示了Foo类的类类型，万事万物皆对象，类也是对象，是Class的实例对象
		System.out.println(c1 == c2);
//		System.out.println(c1.);
		Class c3 = null;
		c3 = Class.forName("cn.edu.nju.reflect.Foo");
		System.out.println(c2 == c3);
		
//		通过类类型来创建该类的对象
		Foo foo2 = (Foo)c1.newInstance();
		foo2.print();
	}
}

class Foo {
	void print() {
		System.out.println("Foo类");
	}
}