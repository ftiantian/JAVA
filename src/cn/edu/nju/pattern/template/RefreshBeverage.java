package cn.edu.nju.pattern.template;

/*
 * 抽象基类，为所有子类提供一个算法框架
 * 
 */
public abstract class RefreshBeverage {
	/*
	 * 制作饮料的模板方法
	 * 封装了所有子类共同遵循的算法框架
	 */
	public final void prepareBeverageTemplate() {
//		1.将水煮沸
		boilWater();
//		2.泡制饮料
		brew();
//		3.将饮料倒入杯中
		pourInCup();

		
		if(isCustomerWantsCondiments()) {
//	      4.加入调料味
			addCondiments();
		}
	}
	/*
	 * 钩子方法,Hook,提供一个默认或空的实现
	 * 具体的子类可以自行决定是否挂钩以及如何挂钩
	 * 询问用户是否加入调料
	 */
	protected boolean isCustomerWantsCondiments() {
		return true;
	}
	/*
	 * 抽象基本方法
	 * 加入调料
	 */
	protected abstract void addCondiments();
	/*
	 * 基本方法（所有类共同的方法）
	 * 将饮料倒入杯中
	 */
	private void pourInCup() {
		System.out.println("将饮料倒入杯中");
	}
	/*
	 * 抽象的基本方法，泡制饮料
	 */
	protected abstract void brew();
	/*
	 * 基本方法（对所有饮料共同的行为）
	 * 将水煮沸
	 */
	private void boilWater() {
		System.out.println("将水煮沸");
	}
}
