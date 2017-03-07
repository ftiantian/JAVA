package cn.edu.nju.pattern.handler;

/*
 * 价格处理人，负责处理客户折扣申请
 */
public abstract class PriceHandler {
	/*
	 * 直接后继，用于传递请求
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	/*
	 * 处理折扣申请
	 */
	public abstract void processDiscount(float discount);

	/*
	 * 利用了工厂模式创建PriceHandler的工厂方法
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
