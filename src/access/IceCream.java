package access;


class Sundae {
	private Sundae() {
		System.out.println("create Sundae!");
	}
	static Sundae makeSundae() {
		return new Sundae();
	}
}
public class IceCream {
	public static void main(String[] args) {
//		Sundae s = new Sundae();
		Sundae x = Sundae.makeSundae();
	}
}
