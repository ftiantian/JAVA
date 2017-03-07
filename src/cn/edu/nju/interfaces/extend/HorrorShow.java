package cn.edu.nju.interfaces.extend;

/**
 * ͨ���̳�����չ�ӿ�
 * �ӿڼ̳�ʱ���Լ̳ж������ӿڣ�������ͨ�����ڼ̳е�ʱ�򲻿��Լ̳ж�������ֻ࣬�ܼ̳�һ��
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
		System.out.println("DragonZilla��ʵ��menace()����");
	}
	public void destory() {
		System.out.println("DragonZilla��ʵ��destory()����");
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() {
		System.out.println("VeryBadVampire�е�menace()����");
	}
	public void destory() {
		System.out.println("VeryBadVampire�е�destory()����");
	}
	public void kill() {
		System.out.println("VeryBadVampire�е�kill()����");
	}
	public void drinkBlood() {
		System.out.println("VeryBadVampire�е�drinkBlood()����");
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
