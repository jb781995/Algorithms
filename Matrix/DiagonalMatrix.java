package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/program-check-diagonal-matrix-scalar-matrix/
 */
public class DiagonalMatrix {
 public static boolean isDiagonal(int [][] mat, int row, int col) {
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
			// condition to check 
             // other elements  
             // except main diagonal  
             // are zero or not.
			 if(i!=j && mat[i][j]!=0)
				 return false;
		 }
	 }
	 return true;
 }
 
 public static boolean isScalar(int [][] mat, int row) {
	// Check all diagonal elements 
     // are same or not. 
	 for(int i=0;i<row;i++)
		 if(mat[i][i]!=mat[i+1][i+1])
			 return false;
	 return true;
 }
	public static void main(String[] args) {
		int mat[][] = { 
				{ 4, 0, 0, 0 }, 
                { 0, 7, 0, 0 }, 
                { 0, 0, 5, 0 }, 
                { 0, 0, 0, 1 } 
                };
		if(isDiagonal(mat, mat.length, mat[0].length))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
