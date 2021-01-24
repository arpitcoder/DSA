package geeksterassignments;
import java.util.Scanner;
public class Lcmwithoutrecursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1= input.nextInt();
		int num2= input.nextInt();
	    int lcm;
	    lcm=(num1>num2)? num1:num2;

	    while(true) {
	    	if(lcm%num1==0 && lcm%num2==0) {
	    		System.out.printf("The lcm of %d and %d is %d",num1,num2,lcm);
	    		break;
	    	}
	    	lcm++;
	    	
	    }
	}

}
