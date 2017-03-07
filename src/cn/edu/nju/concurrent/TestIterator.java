package cn.edu.nju.concurrent;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestIterator {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
			if(s.equals("second"))
				list.remove(s);
		}
		
		Collections.sort(list);
	}
}
