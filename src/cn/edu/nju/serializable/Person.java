package cn.edu.nju.serializable;

import java.io.Serializable;

/**
 * ���л��ͷ����л�����Ҫ���л�person��
 * �����Ƚ���Person��
 * @author fantiantian
 *
 */
public class Person implements Serializable{
	private static final long serialVersionUID = -5809782578272943999L;
	private int age;
	private transient String name;
	private String sex;
	
	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSex() {
		return sex;
	}
	
	/*public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}*/
}
