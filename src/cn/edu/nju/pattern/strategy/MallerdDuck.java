package cn.edu.nju.pattern.strategy;

public class MallerdDuck extends Duck {

	public MallerdDuck() {
//		���ø���Ĺ��췽��
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	@Override
	public void display() {
		System.out.println("�ҵĲ�������ɫ��");
	}

}
