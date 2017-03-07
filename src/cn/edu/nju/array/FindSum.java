package cn.edu.nju.array;

/**
 * ����������ָ���͵�������
 * �㷨���ȶ������е�������ѡ���Ӷȵ͵��㷨����Ϊ�����㷨�����������㷨�ĸ��Ӷȣ�
 * �����㷨����ѡ���ǿ�������
 * Ȼ����ͬʱ��ǰ������ߴӺ���ǰ��������
 * @author fantiantian
 *
 */
public class FindSum {
	public static void sort(int[] array, int low, int high) {
		int i, j;
		int index;
		if(low >= high)
			return;
		i = low;
		j = high;
		index = array[i];
		while(i < j) {
			while(i<j && array[j]>=index)
				j--;
			if(i<j) {
				array[i] = array[j];
				i++;
			}
			
			while(i<j && array[i]<index)
				i++;
			if(i<j) {
				array[j] = array[i];
				j--;
			}
		}
		
		array[i] = index;
		sort(array, low, i-1);
		sort(array, i+1, high);
	}
	
	public static void quickSort(int[] array) {
		sort(array, 0, array.length-1);
	}
	
	public static void findSum(int[] array, int sum) {
		quickSort(array);
		
		for (int i=0; i<array.length; i++)
			System.out.print(array[i] + ", ");
		System.out.println();
		int begin = 0;
		int end = array.length-1;
		while(begin < end) {
			if(array[begin]+array[end] > 20) {
				end--;
			}
			else if(array[begin]+array[end] < 20) {
				begin++;
			}
			else {
				System.out.println(array[begin] + "," + array[end]);
				end--;
				begin++;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 7, 17, 2, 6, 3, 14};
		findSum(array, 20);
	}
}
