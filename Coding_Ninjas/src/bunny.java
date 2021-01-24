import java.util.Scanner;
public class bunny {

	public static int bunnyears(int bunnies) {
		if(bunnies==0) {
			return 0;
		}
		int ears;
		if(bunnies%2==0) {
			ears=3;
		}
		else {
			ears=2;
		}
		return ears+bunnyears(bunnies-1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the number of the bunnies");
		int num=s.nextInt();
		int result = bunnyears(num);
		System.out.println(result);

	}

}
