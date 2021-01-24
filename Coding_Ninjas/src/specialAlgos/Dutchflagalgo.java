package specialAlgos;
import java.util.Scanner;
public class Dutchflagalgo {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter how many streams of input do you want to enter");
		int num=input.nextInt();
		int arr[]=new int[num];
		int numOfzeroes=0;
		for(int i=0;i<num;i++) {
			arr[i]=input.nextInt();
			if(arr[i]==0) {
				numOfzeroes++;
			}
		}
		for(int i=0;i<num;i++) {
			if(numOfzeroes!=0) {
				arr[i]=0;
				numOfzeroes--;
			}
			else {
				arr[i]=1;
			}
		}
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
