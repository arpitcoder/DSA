package patternsGeekster;

public class UpperPyramidNumberRep {

	public static void printSpaces(int noOfSpaces) {
		for(int i=0;i<noOfSpaces;i++) {
			System.out.print(" ");
		}
	}
	public static void printStars(int noOfStars, int numrep) {
		for(int i=0;i<noOfStars;i++) {
			System.out.print(numrep);
		}
	}
	
	
	public static void main(String[] args) {
        int numrep=1;
		for(int i=1;i<=5;i++) {
			printSpaces(5-i);
			
			printStars(2*i-1,numrep);
			
			System.out.println();
			numrep++;
		}

	}

}
