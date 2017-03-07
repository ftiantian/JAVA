package test;

public strictfp class testStrictfp {
	static String i;
	static int j;
	public static void testStrictfp() {
		float f = 0.12365f;
		double d = 0.03496421d;
		double sum = f + d;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		testStrictfp();
		//String i = null;
		System.out.println(i);
		//int j;
		System.out.print(j);
	}
}