import java.util.Scanner;
public class power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int base = sc.nextInt();
		int power=sc.nextInt();
		int result=1;
		for(int i=power;i>0;i--) {
			result = result*base;
		}
     System.out.println(result);
	}

}
