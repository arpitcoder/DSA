package geeksterassignments;
import java.util.Scanner;
public class ArmstrongCheck {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num= input.nextInt();
		int forCheck=num;
		int result=0;
		while(num>0) {
			int digit=num%10;
			result+=Math.pow(digit, 3);
			num=num/10;
		}
		if(result==forCheck) {
			System.out.println("Its an Armstrong number");
		}
		else {
			System.out.println("Not an Armstrong");
		}

	}

}
