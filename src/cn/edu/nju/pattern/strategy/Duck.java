package cn.edu.nju.pattern.strategy;

public abstract class Duck {
	
	/*
	 * 鸭子发出的叫声
	 * 通过行为，由超类实现
	 */
	public void quack() {
		System.out.println("gagaga");
	}
	
	/*
	 * 显示鸭子的外观
	 * 鸭子的外观各不相同，声明为abstract，由子类实现
	 */
	public abstract void display();
	
	private FlayingStragety flyingStragety;

	public void setFlyingStragety(FlayingStragety flyingStragety) {
		this.flyingStragety = flyingStragety;
	}
	
	public void fly() {
		flyingStragety.performFly();
	}
}
