package cn.edu.nju.pattern.strategy;

public class MallerdDuck extends Duck {

	public MallerdDuck() {
//		调用父类的构造方法
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	@Override
	public void display() {
		System.out.println("我的脖子是绿色的");
	}

}
