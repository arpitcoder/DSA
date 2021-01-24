package geeksterassignments;
import java.util.Scanner;
public class Testclass {
	  public static int countofdigits(int n){
	        int count=0;
	        while(n>0){
	            count++;
	            n=n/10;
	        }
	        return count;
	    }
		public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			int num= input.nextInt();
			System.out.println(countofdigits(num));
	}

}
