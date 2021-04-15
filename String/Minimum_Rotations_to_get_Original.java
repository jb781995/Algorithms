package Geeks.String;
/*
 * https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
 * https://www.geeksforgeeks.org/minimum-rotations-required-get-string/
 */
public class Minimum_Rotations_to_get_Original {
	//https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/
 public static int minRotations(String str, String str2) {
	 int n = str.length();
	 StringBuffer buffer = new StringBuffer(str);
	 buffer.append(str);
	 int i=0;
	 for(i=0;i<buffer.length();i++) {
		 String s = buffer.substring(i, i+str.length());
		 if(s.contentEquals(str2))
		  break;
	 }
	 return i;
 }
 
 //https://www.geeksforgeeks.org/minimum-rotations-required-get-string/
 public static int minRotations2(String str, String str2) {
	 int n = str.length();
	 StringBuffer buffer = new StringBuffer(str);
	 buffer.append(str);
	 int i=0;
	 for(i=1;i<buffer.length();i++) {
		 String s = buffer.substring(i, i+str.length());
		 if(s.contentEquals(str2))
		  break;
	 }
	 return i;
 }
	public static void main(String[] args) {
		// //  original = geeks. string buffer = geeksgeeks. n=5
		String str = "ABCD";
		String str2 = "CDAB";
		System.out.println("Min Rotations: "+minRotations(str, str2));
		System.out.println();
		// its just that we will pass both the string with the same content if the string's rotation
		//with itself has to be found
		String str3 = "aaaa";
		String str4 = "aaaa";
		System.out.println("Min Rotations: "+minRotations2(str3, str4));

	}

}
