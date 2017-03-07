package cn.edu.nju.interfaces.extend;

/**
 * ���ؼ̳�
 * �̳�ʱֻ�ܴ�һ���ǽӿ���̳У�ʵ�ֽӿڿ���ʵ�ֶ���ӿ�
 * @author fantiantian
 *
 */

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() {
		System.out.println("ActionCharacter fight()");
	}
}

class CanFly1 implements CanFly {
	public void fly() {
		System.out.println("CanFly1�е�fly()");
	}
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim() {
		System.out.println("swim()");
	}
	public void fly() {
		System.out.println("fly()");
	}
}
public class Adventure {
	public static void t(CanFight x) { x.fight(); }
	public static void u(CanSwim x) { x.swim(); }
	public static void v(CanFly x) { x.fly(); }
//	public static void y(CanFly1 x) { x.fly(); }
	public static void w(ActionCharacter x) { x.fight(); }
	
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
//		y(h);
		w(h);
	}
}
