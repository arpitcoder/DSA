package patternsGeekster;

public class SimpleSquarePattern {

	public static void printStars(int noOfstars) {
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
	}
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			printStars(i);
		    System.out.println();
		}

	}

}
