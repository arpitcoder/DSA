import java.util.Scanner;
public class stringreverse {

	public static String reverse(String str) {
		String rev="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		return rev;
	}
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the string that you want to be reversed");
	String str= s.next();
	System.out.println(reverse(str));

	}

}
