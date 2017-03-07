package cn.edu.nju.pattern.template;

/*
 * ������࣬Ϊ���������ṩһ���㷨���
 * 
 */
public abstract class RefreshBeverage {
	/*
	 * �������ϵ�ģ�巽��
	 * ��װ���������๲ͬ��ѭ���㷨���
	 */
	public final void prepareBeverageTemplate() {
//		1.��ˮ���
		boilWater();
//		2.��������
		brew();
//		3.�����ϵ��뱭��
		pourInCup();

		
		if(isCustomerWantsCondiments()) {
//	      4.�������ζ
			addCondiments();
		}
	}
	/*
	 * ���ӷ���,Hook,�ṩһ��Ĭ�ϻ�յ�ʵ��
	 * ���������������о����Ƿ�ҹ��Լ���ιҹ�
	 * ѯ���û��Ƿ�������
	 */
	protected boolean isCustomerWantsCondiments() {
		return true;
	}
	/*
	 * �����������
	 * �������
	 */
	protected abstract void addCondiments();
	/*
	 * ���������������๲ͬ�ķ�����
	 * �����ϵ��뱭��
	 */
	private void pourInCup() {
		System.out.println("�����ϵ��뱭��");
	}
	/*
	 * ����Ļ�����������������
	 */
	protected abstract void brew();
	/*
	 * �������������������Ϲ�ͬ����Ϊ��
	 * ��ˮ���
	 */
	private void boilWater() {
		System.out.println("��ˮ���");
	}
}
