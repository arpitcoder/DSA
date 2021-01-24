import java.util.Scanner;
public class Intrev {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
	int n =s.nextInt();
	int rev=0;
    while(n!=0) {
    	int digit=n%10;
    	rev=rev*10+digit;
    	n=n/10;
    }
    System.out.println(rev);
	}

}
