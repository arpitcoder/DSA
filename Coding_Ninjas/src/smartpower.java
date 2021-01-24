import java.util.Scanner;
public class smartpower {

	public static double power(double base, double pow) {
	   if(pow==0) {
		   return 1;
	   }
	   double temp=power(base,pow/2);
	   if(pow%2==0) {
           return temp*temp;		   
	   }
	   else {
		   return base*temp*temp;
	   }
	}
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	double base = scanner.nextInt();
	double pow=scanner.nextInt();
	System.out.println(power(base,pow));

	}

}
