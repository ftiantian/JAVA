package cn.edu.nju.annotion;

public class AnnoDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		Demo m =new Demo();
//		System.out.println(m.toString());
		Class clazz = Demo.class;
		MyAnno anno = (MyAnno) clazz.getAnnotation(MyAnno.class);
		System.out.println(anno);
	}
}
