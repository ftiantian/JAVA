package cn.edu.nju.pattern.factory;

/**
 * 简单工厂模式
 * @author fantiantian
 *
 */

public class FactoryPatternDemo {
	ShapeFactory shapeFactory = new ShapeFactory();
	
	//调用cirle的对象
	Shape shape1 = shapeFactory.getShape("CIRCLE");
//	调用Circle的draw方法,该方法不能用，我觉得是因为该方法返回null的问题
//	shape1.draw();
	Shape shape2 = shapeFactory.getShape("RECTANGLE");
//	shape2.
	Shape shape3 = shapeFactory.getShape("SQUARE");
	
}
