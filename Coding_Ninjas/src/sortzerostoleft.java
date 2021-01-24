import java.util.Scanner;
public class sortzerostoleft{

	public static void main(String args[]){

		Scanner input= new Scanner(System.in);
		System.out.println("Enter how many 0s and 1s you want to enter");
		int n = input.nextInt();
		int arr[]=new int [n];
		for(int i=0; i<n;i++){
			arr[i]=input.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(arr[i]==0){
				count++;
			}
		}
		int k=0;
		for(int i=0;i<count;i++){
			arr[k]=0;
			k++;
		}
		for(int i=count;i<n;i++){
			arr[i]=1;
		}
		for(int i=0;i<n;i++){       // for displaying the final array
			System.out.print(arr[i]);
		}
	}
}
