package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/print-matrix-zag-zag-fashion/
 */
public class ZigZag {
  public static void printArrZigZag(int[][] arr, int row, int col) {
	  System.out.println("row: "+row+", col: "+col+"\n\n ");
	  System.out.println(arr[row][col]);
	  if(col==arr[0].length-1)
		  row++;
	  else
		  col++;
	  while(col>0) {
		  System.out.println(arr[row++][col--]);
//		  row++;
//		  col--;
	  }
	  System.out.println(arr[row][col]);
	  //System.out.println("row: "+row+", col: "+col);
	  if(row<arr.length-1)
		  row++;
	  else
		 col++; 
	  while(row>0) {
		  System.out.println(""+arr[row--][col++]);
	  }
	  System.out.println(arr[row][col]);
	  //System.out.println("row: "+row+", col: "+col);
	  printArrZigZag(arr, row, col);
  }
	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		printArrZigZag(arr, 0,0);
	}

}
