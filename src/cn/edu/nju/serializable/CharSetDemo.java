package cn.edu.nju.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Person1 implements Serializable {
	//transient关键字使该变量不被序列化
	private transient String name;
	private int age;
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "姓名:" + this.name + ";年龄：" +this.age;
	}
}
public class CharSetDemo {
	public static void ser(Object obj[]) throws Exception{
		OutputStream os = new FileOutputStream(new File(".//data//person2.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(obj);
		System.out.println("序列化成功");
		oos.close();
		os.close();
	}
	
	public static Object[] dser() throws Exception {
		InputStream is = new FileInputStream(new File(".//data//person2.txt"));
		ObjectInputStream os = new ObjectInputStream(is);
		Object obj[] = (Object [])os.readObject();
		os.close();
		is.close();
		return obj;
	}
	
	public static void main(String[] args) throws Exception{
		Person1 per[] = {new Person1("fft", 2), new Person1("gg", 3), new Person1("tt", 4)};
		ser(per);
		Object o[] = dser();
		for(int i=0; i<o.length; i++) {
			Person1 p = (Person1)o[i];
			System.out.println(p);
		}
	}
}
