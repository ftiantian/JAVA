package cn.edu.nju.leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntersectionTwoArrays2 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		int nums1[] = {1, 2, 3, 2};
		int nums2[] = {};
		int len = nums1.length>nums2.length?nums1.length:nums2.length;
		for(int i:nums1) {
			list1.add(i);
		}
		for(int i:nums2) {
			if(list1.contains(i)) {
				list2.add(i);
				int j = list1.indexOf(i);
				list1.remove(j);
				
			}
		}
		int result[] = new int[len];
		int i=0;
		for(int x:list2) {
			result[i] = x;
			i++;
			System.out.println(x);
		}
		
		
	}
}
