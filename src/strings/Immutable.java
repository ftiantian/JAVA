package strings;

public class Immutable {
	public static String upcase(String s){
		return s.toUpperCase();
	}
	public static String lowercase(String s){
		return s.toLowerCase();
	}
	public static void main(String[] args){
		String q="howdy";
		System.out.println(q);
		String qq=upcase(q);
		System.out.println(qq);
		System.out.println(q);
		String p="FANTIANTIAN";
		System.out.println(p);
		String pp=lowercase(p);
		System.out.println("pp:"+pp);
		String tt=p.toLowerCase();
		System.out.println("tt:"+tt);
		System.out.println("p:"+p);
	}
}
