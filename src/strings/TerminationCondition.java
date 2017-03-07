package strings;

class Book {
	boolean checkedOut = false;
	Book(boolean checkOut) {
		checkedOut = checkOut;
	}
	void checkIn() {
		checkedOut = false;
	}
	protected void finalize() {
		if(checkedOut)
			System.out.println("Error:checked out");
	}
}
public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIn();
		System.out.println(novel.checkedOut);
		new Book(true);
		System.gc();
	}
}
