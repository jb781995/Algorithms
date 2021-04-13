package Geeks.Matrix;

import java.util.ArrayList;

/*
 * https://www.geeksforgeeks.org/move-matrix-elements-given-direction-add-elements-value/
 */
public class Move_Matrix_Elements_Given_Direction {
public static void moveMatrix(int [][]a, char d, int n) {
	if(d=='l') {
		for(int i=0;i<n;i++) {
		 ArrayList<Integer> v = new ArrayList<Integer>();
		 ArrayList<Integer> w = new ArrayList<Integer>();
		 int j=0;
		 for(j=0;j<n;j++) 
			 if(a[i][j]!=0)
				 v.add(a[i][j]);
		 
		 //now save the sum of two same consecutive elements 
		 for(j=0;j<v.size();j++)
			 if(j<v.size()-1 && v.get(j) == v.get(j+1)) {
				 w.add(2*v.get(j));
				 j++;
			 }
			 else
				 w.add(v.get(j));
		// filling the each 
        // row element to 0. 
		 for(j =0;j<n;j++)
			 a[i][j]=0;
		 j=0;
		 
		 for(int it=0;it<n;it++)
			 a[i][j++] = w.get(it);
		 
		}
	}
	else if(d=='u') {
		for(int i=0;i<n;i++) {
			 ArrayList<Integer> v = new ArrayList<Integer>();
			 ArrayList<Integer> w = new ArrayList<Integer>();
			 int j=0;	
			// for each element of column 
            // from top to bottom 
			 for(j=0;j<n;j++) 
			     if(a[j][i]!=0)
			    	 v.add(a[j][i]);
			 
			 for(j=0;j<n;j++)
				 if(j<v.size()-1 && v.get(j)==v.get(j+1)) {
					 w.add(2*v.get(j));
					 j++;
				 }
				 else
					 w.add(v.get(j));
			 
			// filling the each 
            // column element to 0. 
			for(j=0;j<n;j++)
				a[j][i] = 0;
			j=0;
			
			for(int it=0;it<n;it++)
				a[j++][i] = w.get(it);			 
		}
	}
	
	for (int i = 0; i < n; i++)  
        for (int j = 0; j < n; j++) 
            System.out.print(a[i][j] + " ");
}
	public static void main(String[] args) {
		int a[][] = { 
				{ 32, 3, 3, 3, 3 }, 
                { 0, 0, 1, 0, 0 }, 
                { 10, 10, 8, 1, 2 }, 
                { 0, 0, 0, 0, 1 }, 
                { 4, 5, 6, 7, 8 } 
                 }; 
		char d1 = 'l';
		char d2 = 'u';
		int n = a.length;
		moveMatrix(a, d1, n);
		
	}

}
