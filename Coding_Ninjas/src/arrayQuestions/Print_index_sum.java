package arrayQuestions;
import java.util.Scanner;
public class Print_index_sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int Q= input.nextInt();
		int array[]=new int [n];
		int print_index_sum[]=new int [n];
		for(int i=0;i<n;i++) {
			array[i]=input.nextInt();
			if(i==0) {
				print_index_sum[0]=array[0];
			}
			else {
			print_index_sum[i]=array[i]+print_index_sum[i-1]; // tricky part 
		}
	}
		int l;
		int r;
		while(Q>0) {
			Q--;
			l=input.nextInt();
			r=input.nextInt();
			if(r<l || l==r || l>=n || r>=n ) {
				System.out.println("Invalid inputs");
			}
			else {
			    int ans;
			    if(l==r) {
			    	ans=array[l];
			    }
			    else if(l==0) {
			    	ans= print_index_sum[r];
			    }
			    else {
			    	ans = print_index_sum[r]-print_index_sum[l-1];  // tricky part
			    }
			    System.out.println("The sum is:"+ans);
			}
		}

	}

}

