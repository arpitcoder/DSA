import java.util.Scanner;
public class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int arr[]= new int[size];
		int numOfZero=0;
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
			if(arr[i] == 0){
				numOfZero++;
			}
		}
		
		for(int i=0; i<size; i++){
			if(numOfZero!=0){
				arr[i] = 0;
				numOfZero--;
			}
			else{
				arr[i] = 1;
			}
		}
		
		for(int i =0; i<size; i++){
			System.out.print(arr[i] +" ");
		}
	}
}