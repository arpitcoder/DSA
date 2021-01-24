package patternsGeekster;
import java.util.Scanner;
public class DiamondPattern {

	public static void lowerPart(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=(2*n-2*i);k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		lowerPart(n);

	}

}
