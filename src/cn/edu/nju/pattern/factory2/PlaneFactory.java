package cn.edu.nju.pattern.factory2;

/**
 * ���幤��
 * @author fantiantian
 *
 */
public class PlaneFactory extends VehicleFactory {
	public Moveable create() {
		return new Plane();
	}
}
