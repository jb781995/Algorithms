package Geeks.Arrays;
/*
 * https://www.geeksforgeeks.org/sliding-window-maximum-set-2/?ref=leftbar-rightbar
 */
public class SlidingWindow {
public static void findMax(int [] arr, int size, int winSize) {
	int q = winSize -1 ;
	int p = 0;
	int t = 0;
	int max = 0;
	while(q<=size-1) {
		if(arr[p]>=max)
			max = arr[p];
		p++;
		
		if(p==q && p!=size) {
			q++;
			p= t++;
			System.out.print("   "+max);
			if(arr[q]>=max)
				max = arr[q];
		}
	}
}
	public static void main(String[] args) {
		int [] arr = {1,3,2,5,4,7,8,5,9,7,6};
		findMax(arr, arr.length, 3);

	}

}
