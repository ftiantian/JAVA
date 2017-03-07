package leetcode;

public class RemoveElement {
	public static int removeElement(int[] A, int elem) {
		int m = 0;
		for (int i=0; i<A.length; i++) {
			if(A[i] != elem) {
				A[m] = A[i];
				m++;
			}
		}
		
		for (int i=0; i<A.length; i++)
			System.out.println(A[i]);
		return m;
	}
	
	public static void main(String[] args) {
		int[] A = {3, 2, 2, 3};
		int value = removeElement(A, 3);
		System.out.println(value);
	}
}
