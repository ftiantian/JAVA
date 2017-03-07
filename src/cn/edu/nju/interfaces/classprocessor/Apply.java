package cn.edu.nju.interfaces.classprocessor;

import java.util.Arrays;

/**
 * 完全解耦
 * @author fantiantian
 *
 */
class Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	
	Object process(Object input) {
		return input;
	}
}

class Upcase extends Processor {
	String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor {
	String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}

public class Apply {
	public static void process(Processor p, Object s) {
		System.out.println(p.name());
		System.out.println(p.process(s));
	}
	
	public static String s = "Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args) {
		//getClass()方法可以获得某对象的类，如果输出的话类默认调用toString()方法输出类的全称
		Processor p = new Processor();
		process(new Upcase(), s);
		process(new Downcase(), s);
		process(new Splitter(), s);
		//s.getClass().getMethod(toUppercase, parameterTypes);
		System.out.println(s.getClass().getSimpleName().toString());
//		System.out.println(s.getClass().getAnnotations());
		//getFields()得到该类声明的属性，输出的是反射
		System.out.println(p.getClass().getFields());
	}
}
