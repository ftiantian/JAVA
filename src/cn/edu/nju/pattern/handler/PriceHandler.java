package cn.edu.nju.pattern.handler;

/*
 * �۸����ˣ�������ͻ��ۿ�����
 */
public abstract class PriceHandler {
	/*
	 * ֱ�Ӻ�̣����ڴ�������
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	/*
	 * �����ۿ�����
	 */
	public abstract void processDiscount(float discount);

	/*
	 * �����˹���ģʽ����PriceHandler�Ĺ�������
	 */
	public static PriceHandler createPriceHandler() {
		PriceHandler salers = new Salers();
		PriceHandler man = new Manager();
		PriceHandler dir = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		
		salers.setSuccessor(man);
		man.setSuccessor(dir);
		dir.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		return salers;
	} 
}
