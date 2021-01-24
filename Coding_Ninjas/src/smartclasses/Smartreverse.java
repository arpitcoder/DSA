package smartclasses;
import java.util.Scanner;
public class Smartreverse {
	
     public static void main(String args[]) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the string");
	String input1=input.nextLine();
	char arrayofstring[]=input1.toCharArray();
	int rightindex=arrayofstring.length-1;
	int leftindex=0;
	while(leftindex<rightindex) {
		char temp=arrayofstring[leftindex];
		arrayofstring[leftindex]=arrayofstring[rightindex];
		arrayofstring[rightindex]=temp;
		leftindex++;
		rightindex--;
	}
	System.out.println(String.valueOf(arrayofstring));
}
}