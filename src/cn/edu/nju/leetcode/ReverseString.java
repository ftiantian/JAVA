package cn.edu.nju.leetcode;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c;
		char cc[] = s.toCharArray();
		for(int i=0; i<s.length()/2; i++) {
			c = cc[i];
			cc[i] = cc[s.length()-1-i];
			cc[s.length()-1-i] = c;
		}
//		for(int i=0; i<cc.length; i++) {
//			System.out.print(cc[i]);
//		}
		cc.toString();
		System.out.println(cc);
	}
}
