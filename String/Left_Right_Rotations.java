package Geeks.String;
/*
 * https://www.geeksforgeeks.org/program-for-array-rotation-continued-reversal-algorithm/
 */
public class Left_Right_Rotations {
public static void reverse(String str, int start, int end) {
	
	
}
	public static void main(String[] args) {
		// String str = "geeksforgeeks"
//		left rotations with d = 2, "eksforgeeksge"
//		right rotations with d = 2, "ksgeeksforgee"
//		the simple algorithm for left:   String ans = str.substring(2) + str.substring(0, 2); 
//		the simple algorithm for right:   String ans = str.substring(2) + str.substring(0, 2); 
		/*
		 * the reversal algorithm
		 * Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
            A = [1, 2] and B = [3, 4, 5, 6, 7]
            Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
            Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
            Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
		 */
		String str = "1234567";
		int d =2;
		int n = str.length();
		reverse(str,0, d-1);
		reverse(str, d, n-1);
		reverse(str, 0, n-1);
	}

}
