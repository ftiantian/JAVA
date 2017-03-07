package cn.edu.nju.reusing;

/**
 * 
 * @author fantiantian
 * 如果基类的构造器带参数，那么在继承类中第一件事就是用super调用基类的构造方法
 * 如果不带参数，那么会直接去基类中找相应的构造方法
 */
class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame() {
		super(8);
		System.out.println("BoardGame Constructor");
	}
}
public class Chess extends BoardGame {
	Chess() {
//		super(9);
		System.out.println("Chess Constructor");
	}

	public static void main(String[] args) {
		Chess chess = new Chess();
	}
}
