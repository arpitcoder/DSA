
public class jaggedarray {

	public static void main(String[] args) {
		int r=5;
		int array[][]=new int [r][];
		for(int i=0;i<array.length;i++) {   //creating 2d array in which each row contains +1 elements
			array[i]=new int [i+1];
		}
		int count=0;                        //initializing the array
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
			array[i][j]=count++;
			}
		}
		for(int i=0;i<array.length;i++) {    //printing the array
			for(int j=0;j<array[i].length;j++) {
			System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}

}
