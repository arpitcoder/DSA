import java.util.Scanner;
public class evenoddsum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter how many integers you want");
		int n = sc.nextInt();
		int array[]= new int [n];
		int sum1=0;
		int sum2=0;
		for(int i=0;i<n;i++) {
		   array[i]=sc.nextInt();
		   if(array[i]%2==0) {
			   sum1=sum1+array[i];
		   }
		   else {
			   sum2=sum2+array[i];
		   }
		}
System.out.println(sum1);
System.out.println(sum2);
	}

}
