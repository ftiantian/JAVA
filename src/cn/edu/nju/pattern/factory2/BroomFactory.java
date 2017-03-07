package cn.edu.nju.pattern.factory2;

/**
 * 具体工厂
 * @author fantiantian
 *
 */
public class BroomFactory extends VehicleFactory {
	public Moveable create() {
		return new Broom();
	}
}
