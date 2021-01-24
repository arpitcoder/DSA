package geeksterassignments;
import java.util.Scanner;
public class Checkpalindrome {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int num= input.nextInt();
		int pristinenum=num;
		int rev=0;
		while(num>0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==pristinenum) {
		  System.out.println("Its's a palidrome number");
		}

		else {
			System.out.println("Not a palindrome");
		}

	}

}
