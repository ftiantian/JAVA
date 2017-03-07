package cn.edu.nju.sort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestSelectSort {
	public static void selectSort(int[] a) {
		int temp = 0;
		int flag;
		for (int i=0; i<a.length; i++) {
			temp = a[i];
			flag = i;
			for (int j=i+1; j<a.length; j++) {
				if(a[j]<temp) {
					temp = a[j];
					flag = j;
				}
			}
			
			if(temp != a[i]) {//如果i所指的当前值就是最小值，那么就不用交换，所以可以减少交换
				a[flag] = a[i];
				a[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a = {13, 65, 97, 76, 38, 27, 49};
		selectSort(a);
		for (int i=0; i<a.length; i++)
			System.out.println(a[i]);
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
	}
}
