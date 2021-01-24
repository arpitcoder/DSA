package geeksterassignments;

public class Primeclass {

	public static void main(String[] args) {
		int num =4;
		boolean isPrime=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("its a prime number");
		}
		else {
			System.out.println("Not a prime number");
	}

}
}