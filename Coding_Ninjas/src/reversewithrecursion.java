import java.util.Scanner;
public class reversewithrecursion {

	public static void reverse(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		}
		else {
			System.out.print(num%10);
			reverse(num/10);
		}
	}
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
    int number=input.nextInt();
    System.out.println("You entered :"+number);
    System.out.println("Your reversed number is:");
    reverse(number);
   
	
	}

}
