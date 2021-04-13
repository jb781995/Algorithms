package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/squares-of-matrix-diagonal-elements/
 */
public class Sqaures_Of_Matrix_Diagonal {
public static void diagonalsquare(int [][] mat, int r, int c) {
	for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
			if(i==j)
				System.out.print(" "+mat[i][j]*mat[i][j]);
	System.out.println();
	for(int i=0;i<r;i++)
		for(int j=0;j<c;j++)
			if(i+j==c-1)
				System.out.print(" "+mat[i][j]*mat[i][j]);
}
	public static void main(String[] args) {
		int mat[][] = { 
				{ 2, 5, 7 }, 
                { 3, 7, 2 },  
                { 5, 6, 9 } 
                }; 
		int r = mat.length;
		int c = mat[0].length;
		
       diagonalsquare(mat, r, c); 

	}

}
