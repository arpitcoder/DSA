import java.util.Scanner;
public class recursionpower {

	public static int power(int base, int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return base;
		}
		int result=base*power(base,n-1);
		return result;
	}
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the base and power");
		int base=s.nextInt();
		int n=s.nextInt();
		System.out.println(power(base,n));

	}

}
