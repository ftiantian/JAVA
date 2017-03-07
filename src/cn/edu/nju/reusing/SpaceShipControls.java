package cn.edu.nju.reusing;

public class SpaceShipControls {
	void up(int velocity) {
		System.out.println("up to " + velocity);
	}
	void down(int velocity) {}
	void left(int velocity) {}
	void right(int velocity) {}
	void forward(int velocity) {
		System.out.println("forward to " + velocity);
	}
	void back(int velocity) {}
	void turboBoost() {}
}
