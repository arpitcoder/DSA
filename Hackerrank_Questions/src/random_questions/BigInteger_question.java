package random_questions;
import java.util.*;
import java.math.*;
public class BigInteger_question {
   static BigInteger printBigfactorial(int n) {
	   BigInteger f= new BigInteger("1");
	   for(int i=2;i<=n;i++) {
	   f=f.multiply(BigInteger.valueOf(i));
	   }
	   return f;
   }
	public static void main(String[] args) {
	int n =80;
	System.out.println(printBigfactorial(n));

	}

}
