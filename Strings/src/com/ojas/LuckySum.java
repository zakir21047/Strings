package com.ojas;

import java.util.Scanner;

public class LuckySum {
	static int luckySum(int a,int b,int c) {
		if( a==13) {
			return 0;
		}
		if(b==13) {
			return 13;
		}
		if(c==13)
			return a+b;

	return a+b+c;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		System.out.println(luckySum(sc.nextInt(),sc.nextInt(),sc.nextInt()));
}
}
