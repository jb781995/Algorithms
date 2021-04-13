package Geeks.Matrix;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/minimum-operations-required-make-row-column-matrix-equals/
 */
public class Came_Row_Col_Equal {
	private static int  max=0; 
public static void makeMatrixEqual(int [][] a, int n) {
	
	int  i, j;
	int [] rowSum = new int[n];
	int [] colSum = new int[n];
	for(i=0;i<n;i++) 
		for(j=0;j<n;j++) {
			rowSum[i]+=a[i][j];
			//this is new way of adding column values we saw today. good one
			colSum[j]+=a[i][j];
		}
	System.out.println("row sum: "+Arrays.toString(rowSum)+"\ncol sum: "+Arrays.toString(colSum));
	for(int k=0;k<n;k++) {
		max = Math.max(max, rowSum[k]);
		max = Math.max(max, colSum[k]);
	}
	System.out.println("max: "+max);
	
	// this is a new type of logic
	for(int r=0, c=0; r<n && c<n;) {
		int diff = Math.min(max-rowSum[r], max-colSum[c]);
		
		a[r][c]+=diff;
		rowSum[r]+=diff;
		colSum[c]+=diff;
		
		if(rowSum[r]==max)
			r++;
		if(colSum[c]==max)
			c++;
		}
	
	System.out.println();
	for(int[] arr:a)
	System.out.println("Result: "+Arrays.toString(arr));
}


	public static void main(String[] args) {
		int [][] a= {
				{1,2,3},
				{4,2,3},
				{3,2,1}
		};
		
		makeMatrixEqual(a, a.length);

	}

}
