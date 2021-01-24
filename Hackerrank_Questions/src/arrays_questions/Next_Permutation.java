package arrays_questions;
import java.util.Arrays;
import java.util.Scanner;
public class Next_Permutation {

	    public static int [] nextPermutation(int[] nums) {
	        int i = nums.length - 2;
	        while (i >= 0 && nums[i + 1] <= nums[i]) {
	            i--;
	        }
	        if (i >= 0) {
	            int j = nums.length - 1; //{1,5,8,4,7,6,5,3,1};
	            while (j >= 0 && nums[j] <= nums[i]) {
	                j--;
	            }
	            swap(nums, i, j);  // pehle swap fir reverse if block k bahar aake
	        }
	        else if(i==0){
	        	reverse(nums,0);
	        }
	        reverse(nums, i + 1);
	        return nums;
	    }

	    private static void reverse(int[] nums, int start) {
	        int i = start, j = nums.length - 1;
	        while (i < j) {
	            swap(nums, i, j);
	            i++;
	            j--;
	        }
	    }

	    private static void swap(int[] nums, int i, int j) {
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;
	    }
	public static void main(String[] args) {
		int array[]= {1,5,8,4,7,6,5,3,1};
		// {1,5,8,4,7,6,5,3,1};
		int result[]=new int [array.length];
		result=nextPermutation(array);
		for(int i=0;i<array.length;i++) {
		System.out.print(result[i]+" ");
		}
	}

}
