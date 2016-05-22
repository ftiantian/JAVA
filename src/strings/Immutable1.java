package strings;

public class Immutable1 {
	public static void main(String[] args){
		String s="asdf";
		String x=Immutable.upcase(s);
		System.out.println("s:"+s);
		System.out.println("x:"+x);
		
	}
}
