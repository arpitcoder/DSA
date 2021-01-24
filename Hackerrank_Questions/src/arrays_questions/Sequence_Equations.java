/** Sequence equations **/

package arrays_questions;

public class Sequence_Equations {
    static int[] permutationEquation(int[] p) {
        int n = p.length;
        int ans[]=new int[p.length];
        int k=0;
    for(int x=1;x<=n;x++){
       for(int i=0;i<n;i++){
           if(x==p[i]){
               for(int j=0;j<n;j++){
                   if(i+1==p[j]){
                           ans[k]=j+1;
                            k++;
                       }
                   }
               }
           }
       }
              return ans;

   }
	public static void main(String[] args) {
		int array[]= {5,2,1,3,4};
		int result[]= permutationEquation(array);
		for(int i=0;i<=array.length-1;i++) {
			System.out.println(result[i]);
		}

	}

}
