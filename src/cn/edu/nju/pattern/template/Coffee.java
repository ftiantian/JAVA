package cn.edu.nju.pattern.template;

public class Coffee extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("�����Ǻ�ţ��");
	}

	@Override
	protected void brew() {
		System.out.println("�÷�ˮ���ݿ���");
	}

}
