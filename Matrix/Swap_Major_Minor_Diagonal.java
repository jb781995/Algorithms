package Geeks.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

/*
 * https://www.geeksforgeeks.org/swap-major-minor-diagonals-square-matrix/
 */
public class Swap_Major_Minor_Diagonal {
	int x ;
	public void checkX() {
		System.out.println("x without initializing: "+x);
	}
public static void swap(int[][] arr, int n) {
	
	for(int i=0;i<n;i++) {
		int temp = arr[i][i];
		arr[i][i] = arr[i][n-i-1];
		arr[i][n-i-1] = temp;
	}
	
		
}
	public static void main(String[] args) {
		int matrix[][] = {
				{0, 1, 2},  
                {3, 4, 5},  
                {6, 7, 8}
                }; 
		int n = matrix.length;
		Swap_Major_Minor_Diagonal obj = new Swap_Major_Minor_Diagonal();
		obj.checkX();
		swap(matrix,n);
		for(int i=0;i<n;i++) {
			System.out.println();
			for(int j=0;j<n;j++)
				System.out.print(" "+matrix[i][j]);
		}
		
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for(Entry<String, Integer> map: m.entrySet()) {
			String key = map.getKey();
			Integer object = map.getValue();
		}
		ArrayList<Integer> li = new ArrayList<Integer>();
		Iterator<Integer> it = li.iterator();
		while(it.hasNext()) {
			int val = it.next();
			if(val == 10)
				it.remove();
		}

	}

}
