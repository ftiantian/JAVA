package cn.edu.nju.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestObjSerializeAndDeserialize {
	/**
	 * 序列化Person对象
	 * 其实以我的理解序列化就是把内容写入到txt文件中
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private static void SerializePerson(Object[] obj) throws FileNotFoundException, IOException {
		/*List<Person> l = new ArrayList<Person>();
		for(int i=0; i<person.length; i++) {
			Person person = new Person();
			person.setName("ftt");
			person.setAge(i);
			person.setSex("女");
			l.add(person);
		}*/
		/*Person person = new Person();
		person.setName("ftt");
		person.setAge(23);
		person.setSex("女");*/
		
		//将person对象存储到当前目录data下，完成对Person对象的序列化
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File(".//data//person.txt")));
		//for(int i=0; i<obj.length; i++) {
		oo.writeObject(obj);
		//}
//		oo.writeObject(person);
		oo.flush();
		System.out.println("序列化成功");
		oo.close();
	}
	
	/**
	 * 反序列化
	 * 反序列化就是读出文本文件中的内容
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	private static Object[] DeserializePerson() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(".//data//person.txt")));
//		for(int i=0; i<ois.l)
		Object[] obj = (Object[]) ois.readObject();
		System.out.println("Person对象反序列化成功！");
		ois.close();
		return obj;
	}
	
	public static void main(String[] args) throws Exception {
		Person[] person = {new Person("ftt", 2, "m"), new Person("gg", 3, "f"), new Person("dd", 4, "m")};
		/*for(int i=0; i<person.length; i++) {
			person[i].setName("ftt");
			person[i].setAge(i+1);
			person[i].setSex("女");
		}*/
		SerializePerson(person);
		Person[] p = (Person[])DeserializePerson();
		for(int i=0; i<p.length; i++) {
			System.out.println("反序列化输出第" + i + "个人的信息：");
			System.out.println("name: " + p[i].getName());
			System.out.println("age: " + p[i].getAge());
			System.out.println("sex: " + p[i].getSex());
		}
		
	}
}
