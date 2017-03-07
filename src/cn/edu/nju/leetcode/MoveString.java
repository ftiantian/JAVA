package cn.edu.nju.leetcode;

import java.util.Scanner;

public class MoveString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
//		String[] str = new String[len];
		String temp;
		for(int i=0; i<len; i++) {
//			String str[i] = (String) sc.nextLine();
			temp = sc.nextLine();
			char[] cc = temp.toCharArray();
			int L = cc.length;
			for(int j=0; j<L; j++) {
				char c = cc[j];
				if(c>='A' && c<='Z') {
					for(int k=j+1; k<temp.length(); k++) {
						cc[k-1] = cc[k];
					}
					cc[temp.length()-1] = c;
					j--;
				}
			}
			for(int m=0; m<cc.length; m++)
				System.out.print(cc[m]);
			System.out.println();
		}
	}
}
