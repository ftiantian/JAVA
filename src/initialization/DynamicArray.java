package initialization;

import java.util.Arrays;

public class DynamicArray {
	public static void main(String[] args) {
		/*Integer[] a = {new Integer(1), new Integer(2), 3};
		Integer[] b = {new Integer(1), new Integer(2), 3};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));*/
//		Other.main(new String[]{"fiddle", "de", "dum"});
//		Other.main(args);
		System.out.println(Arrays.toString(args));
	}
}

class Other{
	public static void main(String[] args) {
		for(String s:args)
			System.out.println(s);
	}
}