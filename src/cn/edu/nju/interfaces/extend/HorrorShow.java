package cn.edu.nju.interfaces.extend;

/**
 * 通过继承来扩展接口
 * 接口继承时可以继承多个父类接口，但是普通的类在继承的时候不可以继承多个父类类，只能继承一个
 * @author fantiantian
 *
 */

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destory();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() {
		System.out.println("DragonZilla中实现menace()方法");
	}
	public void destory() {
		System.out.println("DragonZilla中实现destory()方法");
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
		System.out.println("VeryBadVampire中的menace()方法");
	}
	public void destory() {
		System.out.println("VeryBadVampire中的destory()方法");
	}
	public void kill() {
		System.out.println("VeryBadVampire中的kill()方法");
	}
	public void drinkBlood() {
		System.out.println("VeryBadVampire中的drinkBlood()方法");
	}
}
public class HorrorShow {
	static void u(Monster b) {
		b.menace();
	}
	static void v(DangerousMonster d) {
		d.menace();
		d.destory();
	}
	static void w(Lethal l) {
		l.kill();
	}
	
	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}
