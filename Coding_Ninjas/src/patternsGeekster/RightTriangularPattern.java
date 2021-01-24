package patternsGeekster;

public class RightTriangularPattern {

	public static void printStars(int noOfstars) {
		for(int i=0;i<noOfstars;i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			printStars(i);
			System.out.println();
		}

	}

}
