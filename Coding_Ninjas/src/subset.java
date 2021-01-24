import java.util.Scanner;
public class subset {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int array[]= new int[n];
		for(int i=0;i<n;i++) {
			array[i]= s.nextInt();
		}
		System.out.println("Enter the integer to check its summation in the array");
		int k=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if((array[i]+array[j])==k) {
					System.out.println(array[i]+" "+array[j]);
				}
			}
		}

	}

}
