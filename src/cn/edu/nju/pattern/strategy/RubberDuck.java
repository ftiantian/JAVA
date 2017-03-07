package cn.edu.nju.pattern.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWin());
	}
	@Override
	public void display() {
		System.out.println("��ȫ���ƣ���ͺܺ�");
	}
	
	public void quack() {
		System.out.println("�¸¸�");
	}

}
