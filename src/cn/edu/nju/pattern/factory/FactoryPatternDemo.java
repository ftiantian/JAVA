package cn.edu.nju.pattern.factory;

/**
 * �򵥹���ģʽ
 * @author fantiantian
 *
 */

public class FactoryPatternDemo {
	ShapeFactory shapeFactory = new ShapeFactory();
	
	//����cirle�Ķ���
	Shape shape1 = shapeFactory.getShape("CIRCLE");
//	����Circle��draw����,�÷��������ã��Ҿ�������Ϊ�÷�������null������
//	shape1.draw();
	Shape shape2 = shapeFactory.getShape("RECTANGLE");
//	shape2.
	Shape shape3 = shapeFactory.getShape("SQUARE");
	
}
