/** This questions includes checking the given integer and checking 
 * whether  each digit of that number divides the given number**/


package arrays_questions;
import java.util.Scanner;
public class Find_Digit {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n = input.nextInt();
		int count=0;
		String num = String.valueOf(n);
		int temp;
        for(int i=0;i<num.length();i++) {
        	temp=Character.getNumericValue(num.charAt(i));
        	if(temp==0) {
        		continue;
        	}
        	if(n%temp==0) {
        		count++;
        	}
        }
        System.out.println(count);
	}

}
