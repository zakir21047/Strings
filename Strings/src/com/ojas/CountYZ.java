package com.ojas;

import java.util.Scanner;

public class CountYZ {
	static int countYZ(String str) {
		str.toLowerCase();
		int count = 0;
		String[] str1 = str.split(" ");
		for (int  i = 0; i < str1.length; i++) {
			for (int j = str1[i].length() - 1; j > 0; j--) {
				 if(str1[i].charAt(j) == 'y' || str1[i].charAt(j) == 'z' ) {
					 count = count + 1;
					 break;
				 }
			}
			
		}
		return count;
		

	}
	public static void main(String[] args) {
		System.out.println("enter String");
		Scanner sc = new Scanner(System.in);
		System.out.println(countYZ(sc.nextLine()));
	}
}
		