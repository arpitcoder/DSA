import java.util.Scanner;
public class uniquechar {

	public static void uniquecharacter(String input) {
		String temp="";
		for(int i=0;i<input.length();i++) {
			if(temp.indexOf(input.charAt(i))==-1) {
				temp=temp+input.charAt(i);
			}
		}
		System.out.println(temp+" ");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.next();
      uniquecharacter(str);
	}

}
