package cn.edu.nju.concurrent;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Person {
	int height;
	int weight;
	String name;
	public Person(String name) {
		this.name = name;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	/*public boolean equals(Person p) {
		if(this.name == p.name)
			return true;
		else
			return false;
	}*/
}
public class TestEquals {
	public static void main(String[] args) {
		/*String a = new String("abc");
		String b = new String("abc");
		String c = "abc";
		//String a = "abc";
		//String b = "abc";
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());*/
		
		/*char c = 'a';
		System.out.println((int)c);*/
		/*Person p1 = new Person("ftt");
		Person p2 = new Person("ftt");
		
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println("p1.hashcode=" + p1.hashCode());
		System.out.println("p2.hashcode=" + p2.hashCode());*/
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("ftt", 1);
		
		System.out.println(map.put("bbb", 2));
		int temp = map.put("ftt", 3);
		System.out.println(temp);
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		
		Object obj = new Object();
		obj.hashCode();
		
	}
}
