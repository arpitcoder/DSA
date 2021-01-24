package geeksterassignments;

public class GCDothermethod {

	public static void main(String[] args) {
		int num1 =12;
		int num2=15;
		int gcd=0;
		for(int i=1;i<num1&&i<num2;i++) {
			if(num1%i==0 && num2%i==0) {
				gcd =i;
			}
		}
		System.out.println("The GCD is: "+gcd);

	}

}
