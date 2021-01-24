package geeksterassignments;
import java.util.Scanner;
public class SumOdd {

	public static void main(String[] args) {
		int result=0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		int limit=input.nextInt();
		System.out.println("Enter you numbers");
	   int i=0;
		while(i<limit) {
			int num= input.nextInt();
			if(num%2!=0) {
				result+=num;
		}
         i++;			

	}
		System.out.println(result);

}
}