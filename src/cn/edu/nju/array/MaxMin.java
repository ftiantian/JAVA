package cn.edu.nju.array;

public class MaxMin {
	static int Max;
	static int Min;
	
	public static void GetMaxMin(int[] arr) {
		Max = arr[0];
		Min = arr[0];
		
		int len = arr.length;
		
		for(int i=1; i<len; i=i+2) {
			if(i+1>=len) {
				if(arr[i]>Max)
					Max = arr[i];
				if(arr[i]<Min)
					Min = arr[i];
			}
			
			/*if(arr[i] > arr[i+1]){
				if(arr[i]>Max)
					Max = arr[i];
				if(arr[i+1]<Min)
					Min = arr[i+1];
			}
			
			if(arr[i] < arr[i+1]) {
				if(arr[i]<Min)
					Min = arr[i];
				if(arr[i+1]>Max)
					Max = arr[i+1];
			}*/
			else {
				if(arr[i] > arr[i+1]){
					if(arr[i]>Max)
						Max = arr[i];
					if(arr[i+1]<Min)
						Min = arr[i+1];
				}
				
				if(arr[i] < arr[i+1]) {
					if(arr[i]<Min)
						Min = arr[i];
					if(arr[i+1]>Max)
						Max = arr[i+1];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {7,3,19,40,4,1};
		GetMaxMin(array);
		System.out.println("arrays Max=" + Max);
		System.out.println("arrays Min=" + Min);
	}
}
