package cn.edu.nju.pattern.strategy;

/**
 * �����ҵ�ʵ����ģ�����ģʽ������
 * ������һ��Android����Ա������ѡ��java��web����C����������App
 * @author fantiantian
 *
 */

//Strategy���������
interface Strategy {
	void programLanguage();
}

//ConcreteStrategy���������
class ConcreteStrategyJava implements Strategy {
	public void programLanguage() {
		System.out.println("Use java to Program this App");
	}
}

class ConcreteStrategyWeb implements Strategy {
	public void programLanguage() {
		System.out.println("Use Web to Program this App");
	}
}

class ConcreteStrategyC implements Strategy {
	public void programLanguage() {
		System.out.println("Use C to program this App");
	}
}

//Context�������ࣩ
class Context {
	private Strategy strategy;
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void programLanguage() {
		strategy.programLanguage();
	}
}

//�ͻ���
public class ContextStrategy {
	public static void main(String[] args) throws Exception {
		Context context = new Context();
		context.setStrategy(new ConcreteStrategyJava());
		context.programLanguage();
		
		context.setStrategy(new ConcreteStrategyC());
		context.programLanguage();
		
		context.setStrategy(new ConcreteStrategyWeb());
		context.programLanguage();
	}

}
