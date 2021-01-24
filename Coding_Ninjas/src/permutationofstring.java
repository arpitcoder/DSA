import java.util.Scanner;
public class permutationofstring {

	public static String[] permute(String input) {
		if(input.length()==0) {
			String output[]= {""};
			return output;	
	}
		String[] small= permute(input.substring(1));
		String output[]=new String [input.length()*small.length];
		int k=0;
		for(int i=0;i<small.length;i++) {
			String current=small[i];
			for(int j=0;j<=current.length();j++) {
				output[k]=current.substring(0,j)+input.charAt(0)+current.substring(j);
				k++;
			}
		}
		return output;
}
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str= s.nextLine();
		String output[]=permute(str);
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}

	}

}
