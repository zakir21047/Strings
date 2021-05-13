
public class Reverse {

	public static void main(String[] args) {
	Reverse r=new Reverse();
	String s="Rasheeda";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	}

}
