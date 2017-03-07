package cn.edu.nju.pattern.strategy;

public class DuckTest {
	public static void main(String[] args) {
		System.out.println("≤‚ ‘—º◊”≥Ã–Ú");
		Duck duck = null;
//		duck = new MallerdDuck();
//		duck = new RubberDuck();
//		duck = new BigYellow();
		duck = new SpaceDuck();
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("≤‚ ‘ÕÍ±œ");
	}
}
