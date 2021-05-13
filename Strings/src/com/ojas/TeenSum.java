package com.ojas;

import java.util.Scanner;

public class TeenSum {
	static int fixTeen(int num) {
		if(num>=13&&num<=19) {
			if(num==16||num==15) {
				return num;
			}
			else
				return 0;
		}
		return num;
		
	}
	static int noTeenSum(int a,int b,int c) {
		return fixTeen(a) + fixTeen(b) + fixTeen(c);
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(noTeenSum(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}

}
