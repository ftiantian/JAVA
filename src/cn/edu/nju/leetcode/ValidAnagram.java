package cn.edu.nju.leetcode;

import java.util.Arrays;

public class ValidAnagram {
	public static void main(String[] args) {
		String s1 = "anagram";
		String s2 = "nagaram";
		/*if(s1.length() != s2.length()) {
//			return false;
			System.out.println("false");
		}
		else {
			char[] c1 = s1.toCharArray();
			char c2[] = s2.toCharArray();
			boolean bool = true;
			for(char c:c1) {
				Character cc = c;
				if(!s2.contains(cc.toString())) {
					bool = false;
					System.out.println("有不相同字符");
					break;
				} 
			}
			if(bool = true) 
				System.out.println("是Valid Anagram");
			
		}
		*/
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		String ss1 = String.valueOf(c1);
		String ss2 = String.valueOf(c2);
		System.out.println(String.valueOf(c1));
		System.out.println(String.valueOf(c2));
		System.out.println(ss1.equals(ss2));
	}
}
