package cn.edu.nju.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionTwoArrays {
	public Object[] intersection(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<nums1.length; i++) {
			for(int j=0; j<nums2.length; j++) {
				if(nums1[i] == nums2[j]) {
					list.add(nums1[i]);
				}
			}
		}
		Set set = new HashSet();
		return list.toArray();
	}
	
	public static void main(String[] args) {
		intersection({1,2,3,1}, {1,2,5});
		System.out.println();
	}
}
