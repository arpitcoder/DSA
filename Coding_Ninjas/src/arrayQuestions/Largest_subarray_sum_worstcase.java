/** Over here an array is given like {-2,-3,4,-1,-2,1,5,-3} and we have to return the maximum sum of 
 * any array -2 is also a subarray and -2,-3,4 and so on  **/


package arrayQuestions;

public class Largest_subarray_sum_worstcase {

	public static void main (String args[]) {
		int array[]= {1,3,4,5,6,9,3};
		int max=0;
     for(int i=0;i<array.length;i++) {
    	 int sum =0;
    	 for(int j=i;j<array.length;j++) {
    		 sum+=array[j];
    		 
    		// System.out.print(sum+" ");
    		 max=Math.max(max,sum);
    	 }
    	
     }
     System.out.println(max);	 
	}
}
