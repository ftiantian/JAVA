package strings;

public class Leaf {
	int i=0;
	Leaf increment() {
		i++;
		return this;
	}
	void print() {
		System.out.println("i=" + i);
	}
	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment();
		System.out.println(x.increment());
		x.print();
		x.increment();
		x.print();
	}
}
