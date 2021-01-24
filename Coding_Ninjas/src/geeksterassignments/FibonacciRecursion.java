package geeksterassignments;
import java.util.Scanner;
public class FibonacciRecursion {
	static int n1=0,n2=1,n3=0;
	public static void fibonacci(int count) {
		if(count>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibonacci(count-1);
		}
	}
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    int limit=input.nextInt();
    System.out.print(n1+" "+n2);
    fibonacci(limit-2);
	}

}
