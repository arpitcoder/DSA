import java.util.Scanner;
public class uniquechar2 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Enter the array");
       String str= s.next();

        allunique(str);
    }

    private static void allunique(String a) {
     int countofchar[]=new int [256];
     for(int i=0;i<a.length();i++) {
    	 char ch=a.charAt(i);
    	 countofchar[ch]++;
     }
     for(int i=0;i<a.length();i++) {
    	 char chh=a.charAt(i);
    	 if(countofchar[chh]==1) {
    		 System.out.println("unique character for "+i+" th index is "+a.charAt(i));
    	 }
     }
}
}