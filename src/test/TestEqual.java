package test;

public class TestEqual {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		//s2 = s2+'c';
		//String s1 = "abc";
		//String s2 = "abc";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}