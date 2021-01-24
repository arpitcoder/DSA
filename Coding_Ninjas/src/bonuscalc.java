import java.util.Scanner;
public class bonuscalc {

	public static int bonus(int salary, int service) {
		if(service>5) {
			int res = salary+(salary*5)/100;
			return res;
		}
		else {
			return salary;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the salary and the service period");
		int sal=s.nextInt();
		int ser=s.nextInt();
	System.out.println(bonus(sal,ser));

	}

}
