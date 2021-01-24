package smartclasses;
import java.util.*;
public class testclass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string");
		String input1=input.nextLine();
        char[] ch=input1.toCharArray();
        char[] result=new char[ch.length];
        int index=0;
	    for(int i=ch.length-1;i>=0;i--) {
	    	result[index]=ch[i];
	    	index++;
	    }
    System.out.println(String.valueOf(result));
	    
	}

}
