package arrayQuestions;

public class Arrayelementcheck {

	public static void targetPairSumSorted(int target, int[] array) {
		int left=0;
		int right=array.length-1;
			while(left<right) {
				int currSum=array[left]+array[right];
				if(currSum==target) {
					System.out.println(array[left]+" "+array[right]);
					left++;
					right--;
				}
				else if(currSum<target) {
					left++;
				}
				else {
					right--;
				}
			}
		}
	public static void targetPairSum(int arr[]) {
		for(int i=0;i<arr.length;i++)
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==11) {
					System.out.println(arr[i]+ " "+arr[j]);
				}
			}
	}
	public static void main(String[] args) {
   
		int arr[]= {10,5,4,3,1,6,7};
		int arr1[]= {1,2,4,5,6,7};
		targetPairSumSorted(11,arr1);
		

	}

}
