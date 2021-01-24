package list_Questions;

import java.util.*;

public class Climbing_the_leaderboard {

	public static int binarysearch(List<Integer> a, int key) {
		int lo=0;
		int hi=a.size()-1;
		while(lo<=hi) {
			int mid=(hi+lo)/2;   // according to the result new mid is calculated everytime when the key is searched.
			if(a.get(mid)==key) {
				return mid;
			}
			else if(key>a.get(mid)&& key<a.get(mid-1)) {
				return mid;
			}
			else if(key<a.get(mid)&&key>=a.get(mid+1)) {
				return mid+1;
			}
			else if(key>a.get(mid)) {
				hi=mid-1;
			}
			else if(key<a.get(mid)) {
				lo=mid+1;
			}
		}
		return -1;
	}
	
	public static List<Integer> climbingleaderboard(List<Integer>ranked,List<Integer>player){
		int n = ranked.size();
		int m = player.size();
		List <Integer>res=new ArrayList<Integer>();
		List <Integer>rank=new ArrayList<Integer>();
		rank.add(0,1);
		for(int i=0;i<n;i++) {
			if(ranked.get(i)==ranked.get(i-1)) {
				rank.add(i,rank.get(i-1));
			}
			else {
				rank.add(i,rank.get(i-1)+1);
			}
		}
		for(int i=0;i<m;i++) {
			int playerscore=ranked.get(i);
		    if(playerscore>ranked.get(0)) {
		    	res.add(i,1);
		    }
		    else if(playerscore<ranked.get(n-1)) {
		    	res.add(rank.get(n-1)+1);
		    }
		    else {
		    	int index=binarysearch(ranked,playerscore);
		    	rank.add(i,rank.get(index));
		    }
		}
		return res;
	}
	public static void main(String[] args) {
	  Scanner input= new Scanner(System.in);
	  List <Integer> ranked=new ArrayList<Integer>();
	  System.out.println("Enter the size of the ranked list");
	  int n =input.nextInt();
	  List <Integer> player=new ArrayList<Integer>();
	  System.out.println("Enter the size of the player list");
	  int m =input.nextInt();
	  System.out.println("Push the ranked list elements");
	  for(int i=0;i<n;i++) {
		  int p=input.nextInt();
		  ranked.add(p);
	  }
//	  int p=0;
//	  while(p<n) {
//		  int q=input.nextInt();
//		  ranked.add(q);
//		  p++;
//	  }
	  System.out.println("Push the elements of the player list");
	  for(int i=0;i<m;i++) {
		  int q=input.nextInt();
		  player.add(q);
	  }
//	  int i =0;
//	  while(i<m) {
//		 int j=input.nextInt();
//		  player.add(j);
//		  i++;
//	}
	  List <Integer> result=climbingleaderboard(ranked,player);
	  
	  
	  System.out.println(result);
	  
	}
	

}
