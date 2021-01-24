package random_questions;
import java.util.Scanner;
public class Time_in_words {
	 public static String hours(int hrs) {
		String hour="";
     	switch(hrs){
         case 1: hour="one";
         break;
         case 2: hour="two";
         break;
         case 3: hour="three";
         break;
         case 4: hour="four";
         break;
         case 5: hour="five";
         break;
         case 6: hour="six";
         break;
         case 7: hour="seven";
         break;
         case 8: hour="eight";
         break;
         case 9: hour="nine";
         break;
         case 10: hour="ten";
         break;
         case 11: hour="eleven";
         break;
         case 12: hour="twelve";
         break;
     }   
     	return hour;
     }
	 
	static String timeInWords(int h, int m) {
        String hour="";
        String minute="";
       
    
        String result="";
        String general="";
        if(m==0){
        	String hour1=hours(h);
            general ="o' clock";
            result=hour1+" "+general;
        }
        else if(m==15){
        	String hour1=hours(h);
            general="quarter past";
            result=general+" "+hour1;
        }
        else if(m<10 && m>=1){
            switch(m){
                case 1:minute="one";
                break;
                case 2:minute="two";
                break;
                case 3: minute="three";
                break;
                case 4: minute="four";
                break;
                case 5: minute="five";
                break;
                case 6: minute="six";
                break;
                case 7: minute="seven";
                break;
                case 8: minute="eight";
                break;
                case 9: minute="nine";
                break;
            }
            general="minute past";
            result=minute+" "+general+" "+hour;
        }
        else if(m>=10 && m<30){
        	String hour1=hours(h);
            switch(m){
                case 11: minute="Eleven";
                break;
                case 12: minute="twelve";
                break;
                case 13: minute="thirteen";
                break;
                case 14: minute="fourteen";
                break;
                //case 15: minute="fifteen";
                case 16: minute="sixteen";
                break;
                case 17: minute="seventeen";
                break;
                case 18: minute="eighteen";
                break;
                case 19: minute="nineteen";
                break;
                case 20: minute="twenty";
                break;
                case 21: minute="twenty one";
                break;
                case 22: minute="twenty two";
                break;
                case 23: minute="twenty three";
                break;
                case 24: minute="twenty four";
                break;
                case 25: minute="twenty five";
                break;
                case 26: minute="twenty six";
                break;
                case 27: minute="twenty seven";
                break;
                case 28: minute="twenty eight";
                break;
                case 29: minute="twenty nine";
                break;
            }
            general="minutes past";
            result=minute+" "+general+" "+hour1;
        }
        else if(m==30){
        	String hour1=hours(h);
            general="half past";
            result=general+" "+hour1;
        }
        else if(m>30 && m<60 && m!=45){
            h=h+1;
            String hour1=hours(h);
            m=60-m;
            switch(m){
                case 1:minute="one";
                break;
                case 2:minute="two";
                break;
                case 3: minute="three";
                break;
                case 4: minute="four";
                break;
                case 5: minute="five";
                break;
                case 6: minute="six";
                break;
                case 7: minute="seven";
                break;
                case 8: minute="eight";
                break;
                case 9: minute="nine";
                break;
                case 10:minute="ten";
                break;
                case 11: minute="Eleven";
                break;
                case 12: minute="twelve";
                break;
                case 13: minute="thirteen";
                break;
                case 14: minute="fourteen";
                break;
                case 16: minute="sixteen";
                break;
                case 17: minute="seventeen";
                break;
                case 18: minute="eighteen";
                break;
                case 19: minute="nineteen";
                break;
                case 20: minute="twenty";
                break;
                case 21: minute="twenty one";
                break;
                case 22: minute="twenty two";
                break;
                case 23: minute="twenty three";
                break;
                case 24: minute="twenty four";
                break;
                case 25: minute="twenty five";
                break;
                case 26: minute="twenty six";
                break;
                case 27: minute="twenty seven";
                break;
                case 28: minute="twenty eight";
                break;
                case 29: minute="twenty nine";
                break;
            }
            general= "minutes to";
            result=minute+" "+general+" "+hour1;
        }
        else if(m==45){
            h=h+1;
            String hour1=hours(h);
            general="quarter to";
            result=general+" "+hour1;
        }
    return result;
    }
	public static void main(String[] args) {
	Scanner input= new Scanner(System.in);
	int h=input.nextInt();
	int m = input.nextInt();
	System.out.println(timeInWords(h,m));
	}

}
