package arrayQuestions;

public class BuyandSellstocksProblem {

	public static void buyandsellstocks(int arr[]) {
		int currMin=arr[0];
		int maxProfit=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>currMin) {
				int profit=arr[i]-currMin;
				maxProfit=Math.max(maxProfit, profit);
			}
			currMin=Math.min(currMin, arr[i]);
		}
		System.out.println(maxProfit);
	}
	public static void main(String[] args) {
		int array[]= {7,8,6,4,9,2,1};
		buyandsellstocks(array);

	}

}
