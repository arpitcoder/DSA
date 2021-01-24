import java.util.Scanner;
public class dynamiclargest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input =scanner.nextInt();
		int min=input;
		int max=input;
	    boolean toContinue=false;
	    do{
	    	input = scanner.nextInt();
	    	if(max<input){
	    		max=input;
	    	}
	    	if(min>input) {
	    		min=input;
	    	}
	    	System.out.println("The max is :"+max);
	    	System.out.println("The min is :"+min);
	    	System.out.println("Do you wish to continue");
	    	String res= scanner.next();
	    	if(res.equals("Yes")||res.equals("yes")) {
	    		toContinue=true;
	    	}
	    	else {
	    		System.out.println("Okay bye!");
	    		break;
	    	}
	    }while(toContinue);
	}

}

