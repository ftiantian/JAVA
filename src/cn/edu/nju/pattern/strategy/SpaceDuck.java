package cn.edu.nju.pattern.strategy;

public class SpaceDuck extends Duck {

	public SpaceDuck() {
		super();
		super.setFlyingStragety(new FlyWithRocket());
	}
	@Override
	public void display() {
		System.out.println("��ͷ���ͷ��");
	}
	
	public void quack() {
		System.out.println("��ͨ�����ߵ�ͨ�Ÿ¸¸�");
	}
}
