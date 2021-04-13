package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
 */
public class Matrxi_Rotate_90Degress {

	static void rotate(int N, int[][] mat) {
		//consider all the squares one-by-one
		for(int x =0; x<N;x++) {
			//consider elements in the group of 4, bcoz square has 4 corners regardless the size
			for(int y = x; y<N-x-1;y++) {
				//store current cell in temp
				int temp = mat[x][y];
				
				//move values from right to top
				mat[x][y] = mat[y][N-1-x];
				
				//move value from bottom to right
				mat[y][N-1-x] = mat[N-1-x][N-1-y];
				
				//move from left to bottom
				mat[N-1-x][N-1-y] = mat[N-1-y][x];
				
				//assign temp to left
				mat[N-1-y][x] = temp;
				
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
