package geeksterassignments;
import java.util.Scanner;
public class Firstnandlastdigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int num1=num;
		System.out.println("Last digit is: "+num%10);
		while(num1>10) {
			num1=num1/10;
		}
		System.out.println("First digit is: "+num1);
	}

}
