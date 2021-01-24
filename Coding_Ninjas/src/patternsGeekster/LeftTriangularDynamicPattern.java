package patternsGeekster;
import java.util.Scanner;
public class LeftTriangularDynamicPattern {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
