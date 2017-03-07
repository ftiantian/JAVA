package cn.edu.nju.pattern.strategy;

public abstract class Duck {
	
	/*
	 * Ѽ�ӷ����Ľ���
	 * ͨ����Ϊ���ɳ���ʵ��
	 */
	public void quack() {
		System.out.println("gagaga");
	}
	
	/*
	 * ��ʾѼ�ӵ����
	 * Ѽ�ӵ���۸�����ͬ������Ϊabstract��������ʵ��
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
