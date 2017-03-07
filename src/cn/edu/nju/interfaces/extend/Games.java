package cn.edu.nju.interfaces.extend;

/**
 * 接口中的工厂模式
 * 在同一棋盘上下国际象棋和西洋跳棋
 * @author fantiantian
 *
 */

interface Game {
	boolean move();
}
interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
}

class CheckersFactory implements GameFactory {
	public Game getGame() {
		return new Checkers();
	}
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;
	public boolean move() {
		System.out.println("Chess move " + moves);
		return ++moves != MOVES;
	}
}

class ChessFactory implements GameFactory {
	public Game getGame(){
		return new Chess();
	}
}
public class Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while(s.move())
			;
	}
	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}