package cn.edu.nju.reusing;

/**
 * 
 * @author fantiantian
 * �������Ĺ���������������ô�ڼ̳����е�һ���¾�����super���û���Ĺ��췽��
 * ���������������ô��ֱ��ȥ����������Ӧ�Ĺ��췽��
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
