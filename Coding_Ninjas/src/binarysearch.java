import java.util.Scanner;
public class binarysearch{
    public static int binarySearch(int a[],int si, int ei, int x){
        if(si>ei){
            return -1;
        }
        int midIndex=(si+ei)/2;
        if(a[midIndex]==x){
            return midIndex;
        }
        else if(a[midIndex]<x){
            return binarySearch(a,midIndex+1,ei,x);
        }
        else {
            return binarySearch(a,si,midIndex-1,x);
        }
        
    }
     public static void main(String []args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the length of the array that you want");
        int n=s.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int p=s.nextInt();
        
        System.out.println(binarysearch.binarySearch(a,0,a.length-1,p));
        
        
     }
}