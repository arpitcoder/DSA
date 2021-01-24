
public class jagged2 {

	public static void main(String[] args) {
		int r=5;
		int k=0;
		int count=0;
		int [][] array= new int [r][];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<k;j++) {
				array[i][j]=count++;
			}
			k=k*2;
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}

}


