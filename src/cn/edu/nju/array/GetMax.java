package cn.edu.nju.array;

public class GetMax {
	public static int getMax(int[] array) {
		int MAX;
		int MaxValue = array[0];
		int MinValue = array[0];
		
		for(int i=1; i<array.length; i++) {
			if(array[i] > MaxValue) {
				MaxValue = array[i];
			}
			else if(array[i] < MinValue) {
				MinValue = array[i];
			}
		}
		MAX = MaxValue-MinValue;
		return MAX;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 4, 17, 3, 2, 9};
		System.out.println(getMax(array));
	}
}