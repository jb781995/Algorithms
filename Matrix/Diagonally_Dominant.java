package Geeks.Matrix;
/*
 * https://www.geeksforgeeks.org/diagonally-dominant-matrix/
 */
public class Diagonally_Dominant {
	//method-1
	public static boolean isDominant(int[][] a, int n) {
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				sum+=Math.abs(a[i][j]);
			
			//removing the diagonal element 
			sum-=Math.abs(a[i][i]);
			if(Math.abs(a[i][i])<sum)
				return false;
		}
		return true;
	}
	//method-2. Faster than method-1
	public static boolean isDominant2(int [][] a, int n){
		int sum = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)
					continue;
				sum+=Math.abs(a[i][j]);
			}
			if(Math.abs(a[i][i])<sum)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int[][] a= {
				{ 3, -2, 1 }, 
                { 1, -3, 2 }, 
                { -1, 2, 4 }
		};
		int n= a.length;
		long startTime = System.nanoTime();
		System.out.println("result method-1: "+isDominant(a, n));
		long endTime = System.nanoTime();
		System.out.println("time taken: "+(endTime-startTime));
		System.out.println();
		long startTime2 = System.nanoTime();
		System.out.println("result method-2: "+isDominant2(a, n));
		long endTime2 = System.nanoTime();
		System.out.println("time taken: "+(endTime2-startTime2));
		

	}

}
