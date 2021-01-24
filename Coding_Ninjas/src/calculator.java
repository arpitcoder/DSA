import java.util.Scanner;
public class calculator {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		outer:
		while (true) {
		System.out.println("Enter the numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		char res;
		System.out.println("Enter the operation you want to perform in terms of number like 1 for addition");
		int op=sc.nextInt();
		int result;
		if(op==1) {
			result=num1+num2;
			System.out.println(result);
			System.out.print("contuniue? Y or N ");
			res=sc.next().charAt(0);
			if(res=='Y'|| res=='y') {
				continue;
			}
			else
				System.out.println("Good bye have a nice day !!");
				break;
		}
		else if(op==2) {
			result=num1-num2;
			System.out.println(result);
			System.out.print("contuniue? Y or N ");
			res=sc.next().charAt(0);
			if(res=='Y'|| res=='y') {
				continue;
			}
			else
				System.out.println("Good bye have a nice day !!");
				break;
		}
		else if(op==3) {
			result=num1*num2;
			System.out.println(result);
			System.out.print("contuniue? Y or N ");
			res=sc.next().charAt(0);
			if(res=='Y'|| res=='y') {
				continue;
			}
			else
				System.out.println("Good bye have a nice day !!");
				break;
		}
		else if(op==4) {
			result=num1/num2;
			System.out.println(result);
			System.out.print("contuniue? Y or N ");
			res=sc.next().charAt(0);
			if(res=='Y'|| res=='y') {
				continue;
			}
			else
				System.out.println("Good bye have a nice day !!");
				break;
		}
		else if(op==5) {
			result=num1%num2;
			System.out.println(result);
			System.out.print("contuniue? Y or N ");
			res=sc.next().charAt(0);
			if(res=='Y'|| res=='y') {
				continue;
			}
			else
				System.out.println("Good bye have a nice day !!");
				break;
		}
		else {
			System.out.println("Not a valid operator");
		}
		}
	}

}
