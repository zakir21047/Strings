package com.ojas;

public class FibPalindrome {

	public static void fibonaci(int num1,int num2,int range)
    {
        for (int i = 3; i < range; i++) {
            int next=num1+num2;
            num1=num2;
            num2=next;
           
            int val=checkPalindrome(next);
           
            if(val==next)
                System.out.println(next +" Palindrome ");
           
        }
    }
    public static int checkPalindrome(int num)
    {
        int temp=num,rev=0;
        while (num>0) {
            int rem=num%10;
            rev=(rev*10)+rem;
            num/=10;
        }
        if(temp==rev)
            return temp;
        else
            return 0;
    }
    public static void main(String[] args) {
        fibonaci(0,1,12); 
	}

}
