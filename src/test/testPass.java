package test;

public class testPass {
	public static void testPassParameter(StringBuffer ss1, StringBuffer n) {
		ss1.append(" world");
		n.append("ffff");
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		StringBuffer i = new StringBuffer("hh");
		StringBuffer s1 = new StringBuffer("Hello");
		testPassParameter(s1, i);
		System.out.println(i);
		System.out.println(s1);
		char c = 'a';
		int f=0;
		//c += 1;
		//c = c+1;
		//f += c;
		 //f = f+c;
		System.out.println(c);
		System.out.println(f);
	}
}