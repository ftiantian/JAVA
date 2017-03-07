package cn.edu.nju.array;

public class MinDistance {
	public static int minDistance(int[] arr, int a, int b) {
		int pos_a = -1, pos_b = -1, minDistance = Integer.MAX_VALUE;
		for (int i=0; i<arr.length; ++i) {
			if(arr[i] == a) {
				pos_a = i;
				if(pos_b > -1)
					if(Math.abs(i-pos_b) < minDistance) {
						minDistance = Math.abs(i-pos_b);
//						pos_a = i;
					}
						
			}
			if(arr[i] == b) {
				pos_b = i;
				if(pos_a > -1) {
					if(Math.abs(i-pos_a) < minDistance) {
						minDistance = Math.abs(i-pos_a);
//						pos_b = i;
					}
				}
			}
		}
		return minDistance;
	} 
	
	public static void main(String[] args) {
		int[] a = {4, 5, 6, 4, 7, 4, 6, 4, 7, 8, 5, 6, 4, 3, 10, 8};
//		int b = Integer.MIN_VALUE+1;
//		System.out.println(b);
		System.out.println (minDistance(a, 4, 8));
	}
}
