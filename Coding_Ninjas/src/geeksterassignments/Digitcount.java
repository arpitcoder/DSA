package geeksterassignments;
import java.util.Scanner;
public class Digitcount {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num<10) {
			System.out.println(1);
		}
		else {
		int count=1;
		while(num>=10) {
			count++;
			num = num/10;
		}
		System.out.println(count);

	}

}
}