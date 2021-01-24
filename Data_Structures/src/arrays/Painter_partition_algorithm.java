package arrays;

public class Painter_partition_algorithm {

	public static void painterpartition(int board[] ,int k) {
	int max=board[0];
	for(int i=1;i<board.length;i++) {
		if(board[i]>max) {
			max=board[i];
		}
	}
	int sum=0;
	for(int i =0;i<board.length;i++) {
		sum+=board[i];
	}
	int lo=max;   // this is the minimum time painter can take if have unlimited number of painters
	int hi=sum;
	while(lo<hi) {
		int mid=(lo+hi)/2;
		int painterReq=painterCal(board,mid);
		if(painterReq<=k) {
			hi=mid;
		}
		else {
			lo=mid+1; // adding 1 because time unit is also 1;
		}
	}
	 System.out.println(lo); // is the least time 
	
	
	}
	public static int painterCal(int array[],int time) {
	int paintercount=1;
	int sum=0;
	for(int i=0;i<array.length;i++) {
		sum+=array[i];
		if(time<sum) {
		//	sum=array[i];  no need of doing this since I only want to check whether my minimum time alloted can be reduced further or not.
			paintercount++;
		}
	}
	return paintercount;
	}
	public static void main(String[] args) {
		int array[]= {40,30,20,10};
		int k = 2;
        painterpartition(array,k);
	}

}
