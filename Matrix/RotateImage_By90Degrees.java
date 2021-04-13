package Geeks.Matrix;

import java.util.Arrays;

/*
 *  https://www.geeksforgeeks.org/turn-an-image-by-90-degree/
 */
public class RotateImage_By90Degrees {

	// we have to turn m*n matrix into n*m
	public static void rotate (int [][] arr) {
		// number of columns in arr becomes number of rows in res and number of rows in arr are number of columns in res
		int [][] res = new int[arr[0].length][arr.length];
		int cols = arr.length;
		
		for(int i=0;i<arr.length;i++) {
			int rows = arr[i].length;
			cols--;
			for(int j=0;j<arr[0].length;j++) {
				res[j][cols] = arr[i][j]; 
				//System.out.println("res["+j+"]["+cols+"]: "+res[j][cols]);
			}
		}
		
		for(int i=0;i<res.length;i++) {
			System.out.println();
			for(int j=0;j<res[0].length;j++)
				System.out.println(res[i][j]);
		}
	}
	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
				{17,18,19,20}
				
				/*  rotated 90 degrees result
				 *  17  13  9  5  1 
				 *  18  14  10  6  2
				 *  19  15  11  7  3
				 *  20  16  12  8  4
				 */
		};
    
		rotate(arr);
	}

}
