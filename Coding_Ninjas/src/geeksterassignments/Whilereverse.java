package geeksterassignments;
import java.util.Scanner;
public class Whilereverse {

	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int limit=input.nextInt();
	int temp=limit;
	int i=1;
	while(i<=limit) {
		System.out.println(temp--);
		i++;
	}

	}

}
