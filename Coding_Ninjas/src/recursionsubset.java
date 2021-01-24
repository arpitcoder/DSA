import java.util.Scanner;
public class recursionsubset {

	public static int[][] subset(int input[],int si, int k){
		if(si==input.length) {
			if(k==0) {
				return new int[1][0];
			}
			else {
				return new int[0][0];
			}
		}
		int smalloutput1[][]=subset(input,si+1,k);
		int smalloutput2[][]=subset(input,si+1,k-input[si]);
		int output[][]= new int [smalloutput1.length+smalloutput2.length][];
		int index=0;
		for(int i=0;i<smalloutput1.length;i++) {
			output[index++]=smalloutput1[i];
		}
		for(int i=0;i<smalloutput2.length;i++) {
			output[index]=new int[smalloutput2[i].length+1];
			output[index][0]=input[si];
			for(int j=0;j<smalloutput2[i].length;j++) {
				output[index][j+1]=smalloutput2[i][j];
			}
			index++;
		
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n =s.nextInt();
		System.out.println("Enter the elements");
		int array[]= new int [n];
        for(int i=0;i<array.length;i++) {
        	array[i]=s.nextInt();
        }
        System.out.println("Enter the summation integer");
        int k=s.nextInt();
        int output[][]=subset(array,0,k);
        for(int i=0;i<output.length;i++) {
        	for(int j=0;j<output[i].length;j++) {
        		System.out.print(output[i][j]+" ");
        	}
        	System.out.println();
        }
	}

}
