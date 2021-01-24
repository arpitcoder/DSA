import java.util.Scanner;
public class checksquare {

	public static void check(int a , int b) {
		if(a==b) {
			System.out.println("Its a square");
		}
		else {
			System.out.println("Not a square");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the sides of a rectangle");
		int a = s.nextInt();
		int b= s.nextInt();
		check(a,b);

	}

}
