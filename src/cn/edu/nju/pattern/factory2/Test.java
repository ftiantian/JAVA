package cn.edu.nju.pattern.factory2;

public class Test {
	public static void main(String[] args) {
		VehicleFactory factory = new BroomFactory();
		Moveable m = factory.create();
		m.run();
	}
}
