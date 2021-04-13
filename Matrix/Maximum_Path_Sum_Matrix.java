package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/maximum-path-sum-matrix/
 * 10 10  2  0   20  4
   1  0   0  30  2   5     => 11  10  10  50  22  25
   0 10   4  0   2   0     => 11  21  54  50  52  25
   1  0   2  20  0  4      => 22  54  56  74  52  56
   
 */
public class Maximum_Path_Sum_Matrix {
public static int maxPath(int [][] mat, int r, int c) {
	int res = -1;
	for(int i=0;i<c;i++)
		res= Math.max(res, mat[0][i]);
	
	for(int i=1;i<r;i++) {
		res=-1;
		System.out.println("\n");
		for(int j=0;j<c;j++) {
			//when all paths are possible
			if(j>0 && j<c-1)
				mat[i][j]+= Math.max(mat[i-1][j], Math.max(mat[i-1][j-1], mat[i-1][j+1])); 
			
			//if upper right digonal is notpossible
			else if(j>0)
				mat[i][j]+=Math.max(mat[i-1][j-1], mat[i-1][j]);
			
			//if upper left diagonal is not possible
			else
			    mat[i][j]+=Math.max(mat[i-1][j], mat[i-1][j+1]);
			
			res = Math.max(mat[i][j], res);
			System.out.print("  "+mat[i][j]);
		}
	}
	return res;
}
	public static void main(String[] args) {
		int mat[][] = { 
				{ 10, 10, 2, 0, 20, 4 }, 
                { 1, 0, 0, 30, 2, 5 }, 
                { 0, 10, 4, 0, 2, 0 }, 
                { 1, 0, 2, 20, 0, 4 }  
            }; 
		int r = mat.length;
		int c = mat[0].length;
		System.out.println("\n\nMax Path: "+maxPath(mat, r, c));

	}

}
