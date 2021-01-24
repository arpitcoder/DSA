
public class Tower_of_hanoi {

	public static void towerofhanoi(int n , char s, char h, char d) {
		if(n==1) {
			System.out.println("move 1st disk from "+ s +" to "+ d);
			return;
		}
		towerofhanoi(n-1,s,d,h);
		System.out.println("move "+ n +"th disk from "+ s +" to " +d);
		towerofhanoi(n-1,h,s,d);
	}
	public static void main(String[] args) {

    towerofhanoi(3,'s','h','d');
	}

}
