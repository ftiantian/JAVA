package cn.edu.nju.pattern.strategy;

/**
 * 网上找的实例来模拟策略模式的例子
 * 场景是一个Android程序员到底是选择java、web还是C语言来开发App
 * @author fantiantian
 *
 */

//Strategy抽象策略类
interface Strategy {
	void programLanguage();
}

//ConcreteStrategy具体策略类
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

//Context（环境类）
class Context {
	private Strategy strategy;
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void programLanguage() {
		strategy.programLanguage();
	}
}

//客户端
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
