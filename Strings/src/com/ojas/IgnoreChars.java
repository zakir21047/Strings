package com.ojas;

import java.util.Scanner;

public class IgnoreChars {
	static int sumDigits(String number) {
		 String str=number;
		 int sum=0;
		for(int i=0;i<str.length();i++) {
			 char ch=str.charAt(i);
			if( Character.isDigit(ch)) {
				int b = Integer.parseInt(String.valueOf(ch));
				sum=sum+b;
		}
}
		return sum;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(sumDigits(sc.next()));
}
}
