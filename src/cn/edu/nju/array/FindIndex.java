package cn.edu.nju.array;

public class FindIndex {
	public static int findIndex(int[] array, int data) {
		int index = Integer.MIN_VALUE;
		int i = 0;
		int len = array.length;
		
		/*if(len == 0)
			return;*/
		while(i<len) {
			if(Math.abs(data-array[i]) > 0) {
				i = i+Math.abs(data-array[i]);
			}
			else if(Math.abs(data-array[i]) == 0) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int a[] = {3, 4, 5, 6, 5, 6, 7, 8, 9, 8};
		System.out.println(findIndex(a, 9));
	}
}