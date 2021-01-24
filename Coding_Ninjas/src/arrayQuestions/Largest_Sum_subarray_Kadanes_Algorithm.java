/** Kadanes algorithm is the one in which we will add the negative elements of the array if it does
 * not result into becoming negative and the moment it becomes negative we update the currSum which 
 * holds the max sum of contiguous array elements **/



/**  [-2,-3,4,-1,-2,1,5,-3]   **/

package arrayQuestions;

public class Largest_Sum_subarray_Kadanes_Algorithm {
	public static int kadanes(int arr[]) {
		int currSum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			currSum+=arr[i];   //doing sum of the element successively
			if(currSum>max) {
				max=currSum;
			}
			if(currSum<0) { // over here i am creating the second subarray.
				currSum=0;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int array []= {2,-3,4,-1,-2,1,5,-3};
		System.out.println(kadanes(array));

	}

}
