package Geeks.Matrix;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/sort-matrix-row-wise-column-wise/
 */
public class Row_Col_SortMatrix {
public static void sortByRow(int [][] mat, int N) {
	for(int i=0;i<N;i++)
		Arrays.sort(mat[i]);
}

// transpose is flipping an entire matrix by the diagonal
public static void transpose(int[][] mat, int N) {
	for(int i=0;i<N;i++) {
		for(int j=i+1; j<N;j++) {
			// swapping element at index (i, j)  
            // by element at index (j, i) 
			int temp = mat[i][j];
			mat[i][j] = mat[j][i];
			mat[j][i] = temp;
		}
	}
}
public static void printMat(int mat[][], int n) 
{ 
    for (int i = 0; i < n; i++) { 
        for (int j = 0; j < n; j++) 
            System.out.print(mat[i][j] + " "); 
        System.out.println(); 
    } 
}  
// surprising fact is that after the sequence in below code, we can get any matrix 
// sorted row and col wise. isn't is surprising that the same order and sequence
// works for any size of matrix
public static void sortMatRowAndColWise(int [][] mat, int N) {
	sortByRow(mat, N);
	transpose(mat, N);
	sortByRow(mat, N);
	transpose(mat, N);
} 
	public static void main(String[] args) {
		int mat[][] = { 
				{ 4, 1, 3 }, 
                { 9, 6, 8 }, 
                { 5, 2, 7 } 
                };
       int n = mat.length;
       transpose(mat, n);
       printMat(mat, n);
       System.out.println();
       sortMatRowAndColWise(mat, n);
       printMat(mat, n);
       
	}

}
