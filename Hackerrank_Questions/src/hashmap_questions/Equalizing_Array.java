/**In this we will be counting the frequency of the array then checking how many
   deletions of the elements will be required to equalize the array in which 
   only the equal element will remain.**/

// how many elements we'll have to delete to the equalize the array that means only the maximum occurring element remains in the array.

package hashmap_questions;
import java.util.*;
public class Equalizing_Array {

	public static int countingfequencyusinghashmap(int arr[]) {
		HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		int maxKey=0;
		int maxValue=0;
		for(int i:map.keySet()) {
			if(map.get(i)>maxValue) {
				maxKey=i;
				maxValue=map.get(i);
			}
		}
		return arr.length-maxValue;
	}
	public static void main(String[] args) {
		
     int array[]= {3,1,3,4,3,3,6,3};
     int result=countingfequencyusinghashmap(array);
     System.out.println(result);
	
	}
}
