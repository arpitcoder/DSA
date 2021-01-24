package patternsGeekster;

public class LowerPyramid {

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
			
			printSpaces(i-1);
		    
			
			printStars(11-2*i);
			
			System.out.println();
		}

	}

}
