package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/print-given-matrix-counter-clock-wise-spiral-form/
 */
public class Matrix_CounterClock_Spiral {
public static void printSpiral(int [][] arr, int r, int c) {
	int i, k=0, l=0;
	/*
	 * i = iterator
	 * k=0 = starting row index
	 * r= ending row index
	 * l=0=starting col index
	 * c=ending col index
	 */
	
	//initilaize the count
	int count=0;
	//total number of elements in the matrix
	int ele = c*r;
	while(k<r && l<c) {
		if(count == ele)
			break;
		//print the first column from the remaining column
		for(i=k;i<r;i++) {
			System.out.print(" "+arr[i][l]);
			count++;
		}
		l++;
		if(count==ele)
			break;
		for(i=l;i<c;i++) {
			System.out.print(" "+arr[r-1][i]);
			count++;
		}
		r--;
		if(count==ele)
			break;
		
		//print the last column from the remaining columns
      if(k<r) {
		for(i=r-1;i>=k;i--) {
			System.out.println(" "+arr[i][c-1]);
			count++;
		}
		c--;
		
      }
      if(count==ele)
			break;
      
		
	}
}
	public static void main(String[] args) {
		int arr[][] = { 
				{ 1, 2, 3, 4 }, 
                { 5, 6, 7, 8 }, 
                { 9, 10, 11, 12 }, 
                { 13, 14, 15, 16 } 
                };
		int rows = arr.length;
		int cols = arr[0].length;
		

	}

}
