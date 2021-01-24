// Two pointer algorithm 
// works fine but has to be a sorted array

package arrayQuestions;
import java.util.Scanner;
public class Check_TargetSum {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n= input.nextInt();
	int array []= new int [n];
	for(int i=0;i<n;i++) {
		array[i]=input.nextInt();
	}
	int target=input.nextInt();
	int start=0;
	int end=n-1;
	boolean targetsumfound=false;
    while(start<end) {
    	if(array[start]+array[end]<target) {
    		start++;
    	}
    	else if(array[start]+array[end]>target) {
    		end--;
    	}
    	else {
    		targetsumfound=true;
    		break;
    	}
    }
    if(targetsumfound==true) {
    	System.out.print("Yes");
    }
    else {
    	System.out.println("No");
    }
	}

}
