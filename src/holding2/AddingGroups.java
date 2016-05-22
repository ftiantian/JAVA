package holding2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AddingGroups {
	public static void main(String[] args){
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//		for(Integer c:collection)
//			System.out.print(c+", ");
		Integer[] moreInts={6,7,8,9,10};
		collection.addAll(Arrays.asList(moreInts));
//		for(Integer c:collection)
//			System.out.print(c+", ");
		Collections.addAll(collection, 11,12,13,14,15);
//		for(Integer c:collection)
//			System.out.print(c+", ");
		Collections.addAll(collection, moreInts);
//		for(Integer c:collection)
//			System.out.print(c+", ");
		List<Integer> list=Arrays.asList(16,17,18,19,20);
		list.set(1, 99);
		for(Integer c:list)
			System.out.print(c+", ");
	}
}
