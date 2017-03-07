package cn.edu.nju.array;

public class MergeSort {
	public static void sort(int[] arr, int mid) {
		int temp;
		for(int i=0; i<mid; i++) {
			if(arr[mid]<arr[i]) {
				temp = arr[i];
				arr[i] = arr[mid];
				arr[mid] = temp;
				//再对mid后面的进行排序
				midSort(arr, mid);
			}
		}
	}
	
	public static void midSort(int[] arr, int mid) {
		int temp;
		for(int i=mid; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 5, 6, 7 ,9, 2, 4 ,8, 10, 13, 14};
		sort(array, 5);
		for(int i=0; i<array.length; i++) 
			System.out.print(array[i] + ", ");
	}
}
