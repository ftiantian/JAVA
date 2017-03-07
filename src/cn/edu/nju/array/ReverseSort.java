package cn.edu.nju.array;

public class ReverseSort {
	public static int reverseSort(int[] arr) {
		int Num = 0;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1])
				Num++;
		}
		return Num;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 2, 6};
		System.out.println(reverseSort(array));
	}
}