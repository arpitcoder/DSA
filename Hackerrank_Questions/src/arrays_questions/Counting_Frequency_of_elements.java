/** In this question I will use two for loops and count the frequency of all the elements
 *  since we are using two loops so the complexity will be O(n^2) **/

package arrays_questions;
import java.util.Arrays;
import java.util.Scanner;
public class Counting_Frequency_of_elements {
 public static void main(String args[]) {
      Scanner input = new Scanner (System.in);
      int n = input.nextInt();
      int array[] = new int [n];
      for(int i=0;i<n;i++) {
    	  array[i]=input.nextInt();
      }
      boolean visited[]= new boolean [n];
      Arrays.fill(visited, false);
      for(int i=0;i<n;i++) {
    	  if(visited[i]==true) {  // check whether that next element in the array when i goes to the next element it might have already been counted so we have to skip its counting and move on to the next element.
    		  continue;
    	  }
    	  int count=1;
    	  for(int j=i+1;j<n;j++) {
    		  if(array[i]==array[j]) {
    			  visited[j]=true;
    			  count++;
    		  }
    	  }
    	  System.out.println(array[i]+" "+count);
      }
 }
}


