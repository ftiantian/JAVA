package cn.edu.nju.reusing;

class Soap {
	private String s;
	Soap() {
		System.out.println("Soap()");
		//�ڹ������г�ʼ��
		s = "Constructed";
	}
	public String toString() {
		return s;
	}
}
public class Bath {
	//�ڶ���ĵط���ʼ��
	private String s1 = "Happy", s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;
	public Bath() {
		System.out.println("Inside Bath()");
		//�ڹ������г�ʼ��
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	//ʵ����ʼ��
	{ i=47;}
	
	public String toString() {
		if(s4 == null)
			s4 = "Joy";//����Ҫʹ�øö���֮ǰ��ʼ�������Գ�ʼ��
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
