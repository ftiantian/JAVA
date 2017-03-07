package cn.edu.nju.array;

public class ShiftK {
	public static void reverse(int[] array, int b, int e) {
		int temp;
		for(; b<e; b++, e--) {
			temp = array[b];
			array[b] = array[e];
			array[e] = temp;
		}
	}
	
	public static void shift_k(int array[], int k) {
		reverse(array, 0, array.length-k-1);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]);
		System.out.println();
		reverse(array, array.length-k, array.length-1);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]);
		System.out.println();
		reverse(array, 0, array.length-1);
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
		shift_k(array, 2);
	}
}
