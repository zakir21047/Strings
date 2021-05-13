package com.ojas;

import java.util.Scanner;

public class MaxBlock {

	static int maxBlock(String str) {
		int count = 0;
		String s = str;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++)
				if (s.charAt(i) == s.charAt(j)) {

					count++;
				}
		}
		return count;

	}

	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		System.out.println(maxBlock(sc.next()));
	}

}
