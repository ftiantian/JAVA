package cn.edu.nju.array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MostFrequ {
	public static int findMostFrequeInArray(int[] arr) {
		int MaxFrequ = 0;
		int len = arr.length;
		int most = 0;
		
//		统计数组中每个元素出现次数
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<len; i++) {
			if(map.containsKey(arr[i]))
				map.put(arr[i], map.get(arr[i])+1);
			else
				map.put(arr[i], 1);
		}
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			Entry entry = (Entry) it.next();
			if((int)entry.getValue() > MaxFrequ) {
				MaxFrequ = (int)entry.getValue();
				most = (int)entry.getKey();
			}
		}
		
		return most;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 5, 4, 3, 4, 4, 5, 5, 6, 6, 6, 6, 6, 5, 5, 5, 5};
		System.out.println(findMostFrequeInArray(array));
	}
}