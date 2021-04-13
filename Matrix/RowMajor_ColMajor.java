package Geeks.Matrix;

import java.time.Duration;
import java.time.Instant;

/*
 * https://www.geeksforgeeks.org/row-wise-vs-column-wise-traversal-matrix/
 * there are 2 ways ot matrix traversal: row and col. both of the traversal leads to 
 * O(n^2) time but one of these two is more efficient and that depends upon the language.
 * Like in C, store matrix in row major form so while accessing the i+1th element after 
 * ith, most probably it will lead to a hit, which will further reduce the time of program. 
 */
public class RowMajor_ColMajor {
	// taking MAX 10000 so that time difference 
	// can be shown 
	static int MAX= 10000; 
	  
	static int [][]arr = new int[MAX][MAX]; 
	static void rowMajor()  
	{ 
	  
	    int i, j; 
	      
	    // accessing element row wise 
	    for (i = 0; i < MAX; i++)  
	    { 
	        for (j = 0; j < MAX; j++)  
	        { 
	        arr[i][j]++; 
	        } 
	    } 
	} 
	
	static void colMajor()  
	{ 
	  
	    int i, j; 
	      
	    // accessing element column wise 
	    for (i = 0; i < MAX; i++)  
	    { 
	        for (j = 0; j < MAX; j++) 
	        { 
	        arr[j][i]++; 
	        } 
	    } 
	} 
	
	public static void main(String[] args) {
		Instant start = Instant.now();
		rowMajor();
		Instant end = Instant.now();
		System.out.println("Duration row major: "+Duration.between(start, end));
		
		start = Instant.now();
        colMajor();
        end = Instant.now();
        System.out.println("Duration col major: "+Duration.between(start, end));
	}

}
