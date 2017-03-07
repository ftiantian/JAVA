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
	 * ���л�Person����
	 * ��ʵ���ҵ�������л����ǰ�����д�뵽txt�ļ���
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private static void SerializePerson(Object[] obj) throws FileNotFoundException, IOException {
		/*List<Person> l = new ArrayList<Person>();
		for(int i=0; i<person.length; i++) {
			Person person = new Person();
			person.setName("ftt");
			person.setAge(i);
			person.setSex("Ů");
			l.add(person);
		}*/
		/*Person person = new Person();
		person.setName("ftt");
		person.setAge(23);
		person.setSex("Ů");*/
		
		//��person����洢����ǰĿ¼data�£���ɶ�Person��������л�
		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File(".//data//person.txt")));
		//for(int i=0; i<obj.length; i++) {
		oo.writeObject(obj);
		//}
//		oo.writeObject(person);
		oo.flush();
		System.out.println("���л��ɹ�");
		oo.close();
	}
	
	/**
	 * �����л�
	 * �����л����Ƕ����ı��ļ��е�����
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	private static Object[] DeserializePerson() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(".//data//person.txt")));
//		for(int i=0; i<ois.l)
		Object[] obj = (Object[]) ois.readObject();
		System.out.println("Person�������л��ɹ���");
		ois.close();
		return obj;
	}
	
	public static void main(String[] args) throws Exception {
		Person[] person = {new Person("ftt", 2, "m"), new Person("gg", 3, "f"), new Person("dd", 4, "m")};
		/*for(int i=0; i<person.length; i++) {
			person[i].setName("ftt");
			person[i].setAge(i+1);
			person[i].setSex("Ů");
		}*/
		SerializePerson(person);
		Person[] p = (Person[])DeserializePerson();
		for(int i=0; i<p.length; i++) {
			System.out.println("�����л������" + i + "���˵���Ϣ��");
			System.out.println("name: " + p[i].getName());
			System.out.println("age: " + p[i].getAge());
			System.out.println("sex: " + p[i].getSex());
		}
		
	}
}
