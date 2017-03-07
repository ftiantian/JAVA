package cn.edu.nju.pattern.strategy;

public class BigYellow extends Duck {

	public BigYellow() {
		super();
		super.setFlyingStragety(new FlyNoWin());
	}
	@Override
	public void display() {
		System.out.println("我身体很大，全身是黄的");
	}

}
