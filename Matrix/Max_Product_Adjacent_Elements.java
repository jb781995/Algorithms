package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/maximum-product-of-4-adjacent-elements-in-matrix/
 */

public class Max_Product_Adjacent_Elements {
	//We tried finding the solution. Couldn't. This brute force is the only solution available on Geeks too
public static int findMaxProduct(int [][] mat, int n) {
	int result = 0,max=0;
	for(int i=0;i<n;i++) {
		//check the max value horizontally
		for(int j=0;j<n;j++) {
			if((j-3)>=0) {
				result = mat[i][j]*mat[i][j-1]*mat[i][j-2]*mat[i][j-3];
				if(max<result)
					max=result;
			}
			
			//check the max value vertically
			if((i-3)>=0) {
				result = mat[i][j]*mat[i-1][j]*mat[i-2][j]*mat[i-3][j];
				if(max<result)
					max=result;
			}
			
			//check the max value diagonally down->right
			if((i-3)>=0 && (j-3)>=0) {
				result = mat[i][j]*mat[i-1][j-1]*mat[i-2][j-2]*mat[i-3][j-3];
				if(max<result)
					max=result;
			}
			
			//check the max value diagonally up->right
			if((i-3)>=0 && (j-1)<=0) {
				result = mat[i][j]*mat[i-1][j+1]*mat[i-2][j+2]*mat[i-3][j+3];
				if(max<result)
					max=result;
			}
		}
	}
	return max;
} 
	public static void main(String[] args) {
		int arr[][] = {
				{1, 2, 3, 4, 5}, 
                {6, 7, 8, 9, 1}, 
                {2, 3, 4, 5, 6}, 
                {7, 8, 9, 1, 0}, 
                {9, 6, 4, 2, 3}
                }; 
      int n= arr.length;
      System.out.println("Answer: "+findMaxProduct(arr, n));
	}

}
