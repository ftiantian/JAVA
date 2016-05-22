package holding2;

import java.util.Collection;
import java.util.LinkedList;

public class SimpleCollection {
	public static void main(String[] args){
//		Collection<Integer> c=new ArrayList<Integer>();
//		ArrayList<Integer> c=new ArrayList<Integer>();
		Collection<Integer> c=new LinkedList<Integer>();
		for(int i=0;i<10;i++)
			c.add(i);
		for(Integer i:c)
			System.out.print(i+", ");
//		System.out.println(c);
	}
}
