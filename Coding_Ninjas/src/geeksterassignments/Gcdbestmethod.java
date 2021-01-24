package geeksterassignments;
import java.util.Scanner;
public class Gcdbestmethod {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
	    int firstNum=num1>num2?num1:num2;
	    int secNum=num1<num2?num1:num2;
	    for(int gcd=secNum;gcd>=1;gcd--) {
	    	if(firstNum%gcd==0 && secNum%gcd==0) {
	    		System.out.println("The GCD is: "+gcd);
	    		break;
	    	}
	    }
		
		
		
	}
}
