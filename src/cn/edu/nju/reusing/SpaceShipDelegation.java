package cn.edu.nju.reusing;

/**
 * 
 * @author fantiantian
 *代理，代理是不用继承，但是在类中定义一个需要类的对象，然后用该对象调用所具有的方法
 */
public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	public void back(int velocity) {
		controls.back(velocity);
	}
	
	public void down(int velocity) {
		controls.down(velocity);
	}
	
	public void forward(int velocity) {
		controls.forward(velocity);
	}
	
	public void left(int velocity) {
		controls.left(velocity);
	}
	
	public void right(int velocity) {
		controls.right(velocity);
	}
	
	public void turboBoost() {
		controls.turboBoost();
	}
	
	public void up(int velocity) {
		controls.up(velocity);
	}
	
	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
	}
}
