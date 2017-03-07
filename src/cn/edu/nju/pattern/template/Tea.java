package cn.edu.nju.pattern.template;

public class Tea extends RefreshBeverage {

	@Override
	protected void addCondiments() {
		System.out.println("��������");
	}

	@Override
	protected void brew() {
		System.out.println("��80�ȵ���ˮ���ݲ�Ҷ5����");
	}
	
	/*
	 * ����ͨ�����ǵ���ʽѡ����ع��Ӻ���
	 */
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}

}
