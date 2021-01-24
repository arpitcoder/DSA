package arrayQuestions;
import java.util.Scanner;
public class Replace_Ele_with_great_ele_on_right {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
        int n = input.nextInt();
        int array[]=new int [n];
        for(int i=0;i<n;i++) {
        	array[i]=input.nextInt();
        }
        int max =array[n-1];
        for(int i=n-2;i>=0;i--) {
        	int temp=Math.max(max,array[i]);
        	array[i]=max;
        	max=temp;
        }
        array[n-1]=-1;
        for(int i=0;i<n;i++) {
        	System.out.print(array[i]+" ");
        }
	}

}
