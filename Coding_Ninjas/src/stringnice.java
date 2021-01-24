import java.util.Scanner;
public class stringnice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str= s.next();
		char c1[]=str.toCharArray();
		char c2[]=str.toCharArray();
		for(int i=0;i<c1.length;i++) {
			int count=0;
			for(int j=0;j<c2.length;j++) {
				if(c1[i]>c2[j]) {
					count++;
				}
				else {
					continue;
				}
			}
			System.out.println(c1[i]+" "+count);
		}
}
}
