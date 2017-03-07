package cn.edu.nju.reusing;

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}
	void doh(Milhouse m) {
		
	}
	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse {}

class Bart extends Homer {
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}

class Lisa extends Homer {
	@Override
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}
public class Hide {
	public static void main(String[] args) {
//		Bart b = new Bart();
		Lisa b = new Lisa();
		float i = b.doh(1);
//		System.out.println(i);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}
