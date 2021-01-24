package geeksterassignments;
import java.util.Scanner;
public class GCDtwonumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1=input.nextInt();
		int num2= input.nextInt();
		if(num1<num2) {
		int temp=num1;
		num1=num2;
		num2=temp;
		}

		int remainder= num1%num2;
			if(num2%remainder==0) {
				System.out.println("The GCD is: "+remainder);
			}
			else {
				while(remainder!=0) {
				num1=num2;
				num2=remainder;
				remainder=num1%num2;
				
			}
				System.out.println("The GCD is: "+num2);
		}

	}

}
