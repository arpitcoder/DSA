package geeksterassignments;
import java.util.Scanner;
public class Lcmwithrecursion {

	public static int gcd(int first, int sec) {
		if(first==0) {
			return sec;
		}
		return gcd(sec%first , first);
	}
	public static int lcm(int n1, int n2) {
		return (n1/gcd(n1,n2))*n2;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
     System.out.println("The lcm is: "+lcm(num1,num2));
	}

}
