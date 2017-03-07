package cn.edu.nju.array;

public class ReverseString {
	public static void swapString(char[] arr, int front, int end) {
		while(front < end) {
			char temp = arr[end];
			arr[end] = arr[front];
			arr[front] = temp;
			front++;
			end--;
		}
	}
	
//	把字符串转换为数组来进行处理
	public static String swapWords(String s) {
		char[] arr = s.toCharArray();
		swapString(arr, 0, arr.length-1);
		int begin = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ' ') {
				swapString(arr, begin, i-1);
				begin = i+1;
			}
		}
		swapString(arr, begin, arr.length-1);
		return new String(arr);
	}
	
	public static void main(String[] args) {
		String s = "how are you";
		System.out.println(swapWords(s));
	}
}
