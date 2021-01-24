package patternsGeekster;

public class PyramidPattern {

	public static void printSpaces(int noOfspaces) {
		for(int i=0;i<noOfspaces;i++) {
			System.out.print(" ");
		}
	}
	public static void printStars(int noOfstars) {
		for(int i=0;i<noOfstars;i++) {
			System.out.print("*");
		}
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			printSpaces(5-i);
			
			printStars(2*i-1);
			
			System.out.println();
		}

	}

}
