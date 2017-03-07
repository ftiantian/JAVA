package cn.edu.nju.array;

public class SecondMax {
	public static int FindSecmax(int[] arr) {
		int len = arr.length;
		int Max;
		int secMax;
		if(arr[0]>arr[1]) {
			Max = arr[0];
			secMax = arr[1];
		} else {
			Max = arr[1];
			secMax = arr[0];
		}
		
		for (int i=2; i<len; i++) {
			if(arr[i] > Max) {
				secMax = Max;
				Max = arr[i];
			}
			else if(arr[i] < Max) {
				if(arr[i] > secMax)
					secMax = arr[i];
			}
		}
			
		return secMax;
	}
	
	public static void main(String[] args) {
		int[] array = {7, 3, 19, 40, 4, 7, 1};
		System.out.println(FindSecmax(array));
		
		int value = Integer.SIZE;
		System.out.println(value);
	}
}
