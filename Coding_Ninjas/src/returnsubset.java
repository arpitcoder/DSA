import java.util.Scanner;
public class returnsubset {

	public static int[][] subsethelper(int input [], int si){
		if(si==input.length) {
			int output[][]=new int [1][0];
			return output;
		}
		int small[][]= subsethelper(input, si+1);
		int[][] output= new int[2*small.length][];
		int k=0;
		for(int i=0;i<small.length;i++) {
			output[k]=new int [small[i].length];
			for(int j=0;j<small[i].length;j++) {
				output[k][j]=small[i][j];
			}
			k++;
		}
		for(int i=0;i<small.length;i++) {
			output[k]=new int [small[i].length+1];
			output[k][0]=input[si];
			for(int j=1;j<=small[i].length;j++) {
				output[k][j]=small[i][j-1];
			}
			k++;
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the arary");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		int array[]=new int [n];
		for(int i=0;i<n;i++) {
			array[i]=s.nextInt();
		}
		int output[][]= subsethelper(array,0);
		for(int i=0;i<output.length;i++) {
			for(int j=0;j<output[i].length;j++) {
				System.out.print(output[i][j]+" ");
			}
			System.out.println();
		}

	}

}
