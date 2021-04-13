package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/rotate-matrix-elements/
 */
public class Matrix_Rotation {

	static int R=4, C=4;
	// m= R, n =C
	static void rotateMatrix(int m, int n, int[][] arr) {
		int row =0, col =0;
		int prev, curr;
		
		/*
		 * row - starting row index
		 * m - ending row index
		 * col - starting col index
		 * n - ending col index
		 */
		while(row<m && col<n) {
			if(row==m-1 || col == n-1)
				break;
			
			
		}
	}
	
	public static void main(String[] args) {
		int a[][] = { 
				{1, 2, 3, 4}, 
                {5, 6, 7, 8}, 
              {9, 10, 11, 12}, 
              {13, 14, 15, 16} 
              }; 
		
		

	}

}
