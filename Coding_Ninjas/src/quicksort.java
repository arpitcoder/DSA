import java.util.Scanner;
public class quicksort {
   
	public static int partition(int a[], int si, int ei) {
		int pivotElement=a[si];
		int count=0;
		for(int i=si+1;i<=ei;i++) {
			if(a[i]<pivotElement) {
				count++;
			}
		}
		int temp=a[si+count];
		a[si+count]=pivotElement;
		a[si]=temp;
		int i=si;
		int j=ei;
		while(i<j) {
			if(a[i]<pivotElement) {
				i++;
			}
			else if(a[j]>=pivotElement) {
				j--;
			}
			else {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		return si+count;
	}
	public static void quickSort(int a[], int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pivotIndex=partition(a,si,ei);
		quickSort(a,si,pivotIndex-1);
		quickSort(a,pivotIndex+1,ei);
	}
	public static void main(String[] args) {
    
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int n= s.nextInt();
		int array[]= new int [n];
		System.out.println("Enter the elements");
		for(int i =0;i<n;i++) {
		    array[i]=s.nextInt();
		}
		quickSort(array,0,n-1);

		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}

}
