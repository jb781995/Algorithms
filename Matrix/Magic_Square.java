package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/magic-square-even-order/
 */
public class Magic_Square {
public static void doublyEven(int n) {
	int [][] arr = new int [n][n];
	int i, j;
	
	for(i=0;i<n;i++) {
		System.out.println();
		for(j=0;j<n;j++) {
			int t = (n*i)+j+1;
			System.out.print(" "+t);
			arr[i][j] = (n*i)+j+1;
		}
	}
}
	public static void main(String[] args) {
		doublyEven(4);

	}

}
