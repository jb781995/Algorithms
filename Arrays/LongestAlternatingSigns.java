package Geeks.Arrays;
/*
 * https://www.geeksforgeeks.org/longest-alternating-subsequence-in-terms-of-positive-and-negative-integers/?ref=leftbar-rightbar
 */
public class LongestAlternatingSigns {
public static int longestAltSign(int [] arr) {
	int res = 0, temp=1;
	int i =0, j=1;
	while(j<arr.length) {
		if(arr[i]*arr[j]<0) { 
			i++;
			j++;
			temp++;
		}
		else {
			System.out.println("bcoz: "+arr[i]+" and "+arr[j]+" are same sign");
			i=j;
			res = temp>res?temp:res;
			temp=1;
			j++;
		}
	}
	
	res = temp>res?temp:res;
	
	return res;
}
	public static void main(String[] args) {
		int arr[] = {10, 12, 2, -1};
        System.out.println(longestAltSign(arr));
	}

}
