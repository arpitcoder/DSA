package geeksterassignments;
import java.util.Scanner;
public class CheckPrime {

	public static void Prime(int number) {
		boolean isPrime=true;
		for(int i=2;i<=Math.sqrt(number);i++) {   // root(n) * root(n) = n , so other number has to be either greater than or equal to root(n) that is the boundary says <=math.sqrt(n)
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime==true) {
			System.out.println(number); ;
		}
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the range upto which you want the prime numbers");
		int number=input.nextInt();
		for(int i=2;i<number;i++) {
			Prime(i);
		}

	}

}
