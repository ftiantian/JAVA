package cn.edu.nju.pattern.strategy;

public class RubberDuck extends Duck {

	public RubberDuck() {
		super();
		super.setFlyingStragety(new FlyNoWin());
	}
	@Override
	public void display() {
		System.out.println("我全身发黄，嘴巴很红");
	}
	
	public void quack() {
		System.out.println("嘎嘎嘎");
	}

}
