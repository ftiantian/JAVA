package holding2;

import java.util.Arrays;

public class ArrayisNotIterable {
	static <T> void test(Iterable<T> ib){
		for(T t:ib)
			System.out.print(t+" ");
	}
	public static void main(String[] args){
		test(Arrays.asList(1,2,3));
		System.out.println();
		String[] strings={"A","B","C"};
		test(Arrays.asList(strings));
	}
}
