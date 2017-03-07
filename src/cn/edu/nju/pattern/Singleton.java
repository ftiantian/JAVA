package cn.edu.nju.pattern;

/**
 * 
 * @author fantiantian
 *
 */
/*
 * ����ģʽ
 * Ӧ�ó�������Щ����ֻ��Ҫһ���͹���
 * ���ã���֤����Ӧ�ó�����ĳ��ʵ������ֻ��һ��
 * ���ͣ�����ģʽ������ģʽ
 * �����Ƕ���ģʽ
 */
public class Singleton {
//	1.�����췽��˽�л������������ֱ�Ӵ�������
	private Singleton() {
		
	}
	
//	2.�������Ψһʵ�����Լ����ù��췽������ʵ��
//	ʹ��private static ������ʵ�����ɾ�̬
	private static Singleton instance = new Singleton();
	
//	3.�ṩһ�����ڻ�ȡʵ���ķ�������public static �����θ÷���
	public static Singleton getInstance() {
		return instance;
	}
	
}
