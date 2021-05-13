import java.util.Scanner;

public class Palindrome {
	static  boolean palindrmeCheck(String name) {
		//String s= name;
		String rev="";
		String temp;
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		temp=rev;
		if(temp.equals(name)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		
	System.out.println(palindrmeCheck(name));
}
}
