package test;

public class testAssert {
	public static void main(String[] args) {
		assert 1+1==2;
		System.out.println(1+1==2);
		System.out.println("assert1 ok");
		assert 1+1 == 3 : "assert failed, exit";
		System.out.println(1+1==3);
		System.out.println("assert2 ok");
	}
}