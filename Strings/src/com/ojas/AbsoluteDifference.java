package com.ojas;

import java.util.Scanner;

public class AbsoluteDifference {

	static void absoluteDiff(int number) {
		int value=21;
		number=value-number;
		System.out.println(number);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		absoluteDiff(sc.nextInt());

	}

}
