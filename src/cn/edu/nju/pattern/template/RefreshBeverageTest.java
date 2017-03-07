package cn.edu.nju.pattern.template;

public class RefreshBeverageTest {
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
//		coffee.brew();
//		coffee.prepareBeverageTemplate();
		coffee.brew();
		coffee.addCondiments();
		System.out.println("******************");
		RefreshBeverage tea = new Tea();
		tea.prepareBeverageTemplate();
	}
}
