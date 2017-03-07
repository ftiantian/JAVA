package test;

public class testFinally {
	public static int testFinally1() {
		int result = 1;
		try {
			result = 2;
			return result;
		} catch(Exception e) {
			return 0;
		} finally {
			result = 3;
			System.out.println("execute finally");
//			return 3;
		}
	}
	
	public static StringBuffer testFinally2() {
		StringBuffer s = new StringBuffer("Hello");
		try {
			return s;
		} catch(Exception e) {
			return null;
		} finally {
			s.append(" world");
			System.out.println("execute finally2");
		}
	}
	
	public static void testFinally3() {
		
		try {
//			int i = 5/0;
			System.out.println("try block");
			System.exit(0);
		} catch(Exception e) {
			System.out.println("catch block");
		} finally {
			System.out.println("finally block");
		}
	}
	public static void main(String[] args) {
		int result = testFinally1();
		System.out.println(result);
		
		StringBuffer sb = testFinally2();
		System.out.println(sb);
		
		testFinally3();
	}
}
