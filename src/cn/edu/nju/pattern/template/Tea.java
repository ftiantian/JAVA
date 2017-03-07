package cn.edu.nju.pattern.template;

public class Tea extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");
	}

	@Override
	protected void brew() {
		System.out.println("用80度的热水浸泡茶叶5分钟");
	}
	
	/*
	 * 子类通过覆盖的形式选择挂载钩子函数
	 */
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}

}
