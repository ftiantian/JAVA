package cn.edu.nju.reusing;

public class SpaceShip extends SpaceShipControls {
	private String name;
	public SpaceShip(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		SpaceShip ship = new SpaceShip("NSEA Protector");
		System.out.println(ship);
		ship.forward(100);
	}
}
