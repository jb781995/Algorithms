package Geeks.Matrix;
/*
 * 
 */
public class Sum_Middle_Row_Col {
public static void sumMidRowCol(int[][] mat, int n) {
	
	int row_sum=0, col_sum=0;
	// sum of middle row
	for(int i=0;i<n;i++)
		row_sum+=mat[n/2][i];
	
	// sum of middle col
		for(int i=0;i<n;i++)
			col_sum+=mat[i][n/2];
		
		System.out.println("middle row sum: "+row_sum+", column sum: "+col_sum);
	
	
}
	public static void main(String[] args) {
		int mat[][] = {
				{2, 5, 7}, 
                {3, 7, 2},  
                {5, 6, 9}
                };
  int n = mat.length;
  sumMidRowCol(mat, n);
	}

}
