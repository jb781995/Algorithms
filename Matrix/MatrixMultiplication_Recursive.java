package Geeks.Matrix;

public class MatrixMultiplication_Recursive {
   // i and j for a particular cell and k represents the column number of A[][] and row number of B[][]
	private static int i=0, j=0, k=0;
	
	static void multiplyRec(int row1, int col1, int[][]A, int row2, int col2, int[][]B, int[][]c) {
		// if all rows traversed
		if(i>=row1)
			return ;
		
		// if i < row1. below j<col2 because we have to multiply current row elements of A with all column elements of B ony by one i.e col2
		if(j<col2) {
			if(k<col1) {
				c[i][i]+= A[i][k]*B[k][j];
				k++;
				multiplyRec(row1, col1, A, row2, col2, B, c);
			}
			k=0;
			j++; // next column, since we have to consider all columns of B one by one
			multiplyRec(row1, col1, A, row2, col2, B, c);
		}
		j=0;
		i++;
		multiplyRec(row1, col1, A, row2, col2, B, c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
