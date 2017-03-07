package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class People implements Serializable {
	private String name;
	private int age;
	public People() {
		this.name = "lili";
		this.age = 20;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName() {
		this.name = name;
	}
	
	public static void main(String[] args) {
		People p = new People();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			FileOutputStream fos = new FileOutputStream("people.out");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.close();
		} catch(Exception ex) {
		}
		
		People p1;
		try {
			FileInputStream fis = new FileInputStream("people.out");
			ois = new ObjectInputStream(fis);
			p1 = (People)ois.readObject();
			System.out.println("name: " + p1.getName());
			System.out.println("age: " + p1.getAge());
			ois.close();
		} catch(Exception ex) {
		}
	}
}
