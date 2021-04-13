package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/find-number-of-islands/
 */
public class NumberOf_Islands {
 private static int ROW=0, COL=0;
 
 public static boolean isSafe(int[][] M, int i, int j, boolean [][] visited) {
	// row number is in range, column number is in range 
     // and value is 1 and not yet visited 
	 return i>=0 && i< ROW && j>=0 && j<COL && M[i][j]==1 && !visited[i][j];
 }
  // now remember, in a 2D matrix a cell can have at max 8 neighbors.
 // here
 public static void DFS(int[][] M, int i, int j, boolean [][] visited) {
	 // all the possible 8 directions from a given cell
	 int [] row = {-1, -1, -1, 0, 0, 1, 1, 1};
	 int [] col = {-1, 0, 1, -1, 1, -1, 0, 1};
	 visited[i][j] = true;
	 
	 //recur for all connected neighbors
	 for(int k=0;k<8;k++) {
		 if(isSafe(M, i+row[k], j+col[k], visited))
			 DFS(M, i+row[k], j+col[k], visited);
	 }
 }
	public static int countIslands(int[][] mat) {
		// Make a bool array to mark visited cells. 
        // Initially all cells are unvisited 
		boolean [][] visited = new boolean[ROW][COL];
		// Initialize count as 0 and travese through the all cells 
        // of given matrix
		int count =0;
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<COL;j++) {
				// if the current cell value is 1 and it is not visited, then mark it visited and 
				// visit all its connected islands.
				if(mat[i][j]==1 && !visited[i][j]) {
					DFS(mat, i, j, visited);
				   ++count;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int M[][] = new int[][] { 
			{ 1, 1, 0, 0, 0 }, 
            { 0, 1, 0, 0, 1 }, 
            { 1, 0, 0, 1, 1 }, 
            { 0, 0, 0, 0, 0 }, 
            { 1, 0, 1, 0, 1 } 
            }; 
            ROW = M.length;
            COL = M[0].length;
            countIslands(M);  
            
	}

}
