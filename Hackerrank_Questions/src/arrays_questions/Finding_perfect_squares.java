package arrays_questions;
import java.util.Scanner;
public class Finding_perfect_squares {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int count=0;
		for(int i=a;i<=b;i++) {
			for(int j=1;j*j<=i;j++) {
				if(j*j==i) {
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
