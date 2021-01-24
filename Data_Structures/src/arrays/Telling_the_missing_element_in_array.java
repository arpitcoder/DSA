/** We are a given an array to the check the missing element in the array by using -1 method**/

package arrays;

public class Telling_the_missing_element_in_array {

	public static void main(String args[]) {
		int arr[]= {-4,2,-4,3,2,1};
		for(int i = 0; i < arr.length; i++) 
        { 
            if(arr[Math.abs(arr[i])] > 0) 
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])]; 
            else
                System.out.print(Math.abs(arr[i]) + " "); 
        }          
    }  
  
		}
	}
}