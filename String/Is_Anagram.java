package Geeks.String;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
 */
public class Is_Anagram {
	private static int chars = 256;
  public static boolean isAnagram(String s1, String s2) {
	  
	  String str = "40";
	  int xyz = Integer.parseInt(str);
	  System.out.println("str: "+str+", convetted integer: "+xyz);
	  
	  int [] a1 = new int[chars];
	  int [] a2 = new int[chars]; 
	  for(int i=0;i<s1.length();i++) {
		  a1[s1.charAt(i)]++;
		  a2[s2.charAt(i)]++;
	  }
	  System.out.println(Arrays.toString(a1));
	  
	  for(int i=0;i<s1.length();i++) {
		  if(a1[s1.charAt(i)]!= a2[s1.charAt(i)]) {
			  System.out.println("count of "+s1.charAt(i)+" is NOT same: "+a1[s1.charAt(i)]+" in s1 and "+a2[s1.charAt(i)]+" in s2"); 
			  return false;
		  }
		  System.out.println("count of "+s1.charAt(i)+" is same: "+a1[s1.charAt(i)]+" in s1 and "+a2[s1.charAt(i)]+" in s2");
	  }
	  return true;
  }
  
  //optimized method to have just 1 auxiliary array of size 256. Intuitively, if strings are anagrams,
  //there will be no value at any index. Characters increment and decrement operation would cancel out
  //each other and final result would be 0. If not, then they are not anagrams.
  public static boolean isAnagram2(String s1, String s2) {
	  int [] a1 = new int[chars];
	  
	  for(int i=0;i<s1.length();i++) {
		  a1[s1.charAt(i)]++;
		  a1[s2.charAt(i)]--;
	  }
	  
	  for(int i=0;i<s1.length();i++)
		  if(a1[s1.charAt(i)]!=0)
			  return false;
	  return true;
  }
	public static void main(String[] args) {
		if(isAnagram("triangle","integral"))
			System.out.println("ANAGRAM");
		else
			System.out.println("NOT ANAGRAM");

	}

}
