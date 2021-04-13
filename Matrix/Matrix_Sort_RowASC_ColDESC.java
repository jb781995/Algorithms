package Geeks.Matrix;

import java.util.ArrayList;
import java.util.Collections;

/*
 * https://www.geeksforgeeks.org/sorting-rows-matrix-ascending-order-followed-sorting-columns-descending-order/
 */
public class Matrix_Sort_RowASC_ColDESC {
	
// both the below solutions were found by us. congratulations
public static void sort(int[][] mat) {
	int n= mat.length;
	ArrayList<Integer> li = new ArrayList<Integer>();
	for(int i=0;i<n;i++) {
		System.out.println();
		for(int j=0;j<n;j++) {
			System.out.print(" "+mat[i][j]);
			li.add(mat[i][j]);
			}
	}
	Collections.sort(li);
	System.out.println("  "+li);
	
	int index=0;
	for(int i=mat.length-1;i>=0;i--) {
		for(int j=0;j<mat.length;j++) 
			mat[i][j] = li.get(index++);
	}
	System.out.println("\n\n");
	for(int i=0;i<n;i++) { 
		System.out.println();
		for(int j=0;j<n;j++) 
			System.out.print(" "+mat[i][j]);
			
	}	
	
}

public static void sort2(int [][] mat) {
	int [] arr = new int[mat[0].length];
	int n= mat.length;
	for(int i=0;i<n;i++) { 
		for(int j=0;j<n;j++) 
			arr[j] = mat[j][i];
		sortUtil(mat, arr, i, true);
	}
	
	//first sorting the each column
	for(int i=0;i<n;i++) { 
		for(int j=0;j<n;j++) 
			arr[j] = mat[i][j];
		sortUtil(mat, arr, i, false);
	}
	
	//then sorting each row starting from the bottom. follow the commented progress in main method.
	for(int i=0;i<n;i++) { 
		System.out.println();
		for(int j=0;j<n;j++) 
			System.out.print(" "+mat[i][j]);
			
	}	
}

public static void sortUtil(int[][] mat, int [] arr, int x, boolean flag) {
	for(int i=1;i<arr.length;i++) {
		int temp = arr[i];
		int j=i-1;
		while(j>=0 && arr[j]>temp) {
			arr[j+1] = arr[j];
			j--;
		}
		j++;
		arr[j] = temp;
	}
	
	if(flag) {
		int k=0;
	for(int i=arr.length-1;i>=0;i--)
		mat[i][x] = arr[k++];
	}
	else {
		for(int i=0;i<arr.length;i++)
			mat[x][i] = arr[i];
	}
	//return mat;
}
	public static void main(String[] args) {
		int mat[][] = {
			{3, 2, 1}, 
            {9, 8, 7},  
            {6, 5, 4}
            }; 
		
		// 9  8  7 -> 7  8  9 
		// 6  5  4 -> 4  5  6
		// 3  2  1 -> 1  2  3
		sort2(mat);

	}

}
