package cn.edu.nju.leetcode;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MoveZeros {
	public static void main(String[] args) {
		int nums[] = {1, 3, 0, 6, 4, 0, 5, 6};
		List<Integer> list = new ArrayList<Integer>();
		for(int i : nums) {
			list.add(i);
		}
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) == 0) {
//				int j = list.indexOf(i);
				list.remove(i);
				list.add(0);
			}
		}
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
