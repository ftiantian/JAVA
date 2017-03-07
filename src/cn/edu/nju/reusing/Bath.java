package cn.edu.nju.reusing;

class Soap {
	private String s;
	Soap() {
		System.out.println("Soap()");
		//在构造器中初始化
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}
public class Bath {
	//在定义的地方初始化
	private String s1 = "Happy", s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	public Bath() {
		System.out.println("Inside Bath()");
		//在构造器中初始化
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	//实例初始化
	{ i=47;}
	
	public String toString() {
		if(s4 == null)
			s4 = "Joy";//在正要使用该对象之前初始化，惰性初始化
		return "s1 = " + s1 + "\n" +
				"s2 = " + s2 + "\n" +
				"s3 = " + s3 + "\n" +
				"s4 = " + s4 + "\n" +
				"i = " + i + "\n" +
				"toy = " + toy + "\n" +
				"castille = " + castille;
	}
	
	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}
}
