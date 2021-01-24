package arrays;

public class Moores_Voting_Algorithm_Majority_Element {

    public static void majorityElement(int array[]) {
    	int count=1;
    	int majority=0;
    	for(int i=1;i<array.length;i++) {
    		if(array[majority]==array[i]) {
    			count++;
    		}
    		else {
    			count--;    		}
    		if(count==0) {
    			majority=i;
    			count=1;
    		}
    	}
    	System.out.println(array[majority]);
    	
    }
	public static void main(String[] args) {
		int array[]= {1,3,3,2,3,5};
		majorityElement(array);

	}

}
