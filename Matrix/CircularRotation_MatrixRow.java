package Geeks.Matrix;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/check-rows-matrix-circular-rotations/
 */
public class CircularRotation_MatrixRow {
public static boolean isRotated(int [][] arr) {
	boolean flag= false;
	String str = "";
	int [] ar = arr[0];
	for(int i=0;i<arr[0].length;i++)
		str+="-"+String.valueOf(arr[0][i]);
    str+=str;
	System.out.println(str);
	for(int i=1;i<arr.length;i++) {
		String curr= "";
		for(int j=0;j<arr[i].length;j++)
			curr+="-"+String.valueOf(arr[i][j]);
		if(str.contentEquals(curr))
			return false;
			
	}
	return true;
}

public static boolean isRotated2(int[][] arr) {
	String str = "";
	int [] ar = arr[0];
	for(int i=0;i<arr[0].length;i++)
		str+=Integer.toString(arr[0][i]);
    str+=str;
	System.out.println(str);
	
	for(int i=1;i<arr.length;i++) {
		String curr= "";
		for(int j=0;j<arr[i].length;j++)
			curr+=Integer.toString(arr[i][j]);
		System.out.println("current string: "+curr);
		if(!str.contains(curr))
			return false;
	}
	return true;
}
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{3,2,1},
				{2,3,1}
		};
		
		// both the methods above works just fine
		if(isRotated2(arr))
		System.out.println("Yes");
		else
		System.out.println("No");

	}

}
