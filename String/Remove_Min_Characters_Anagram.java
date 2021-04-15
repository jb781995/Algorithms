package Geeks.String;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/remove-minimum-number-characters-two-strings-become-anagram/
 */
public class Remove_Min_Characters_Anagram {
 public static int removeMinCharacters(String s1, String s2) {
	 int [] a1 = new int[256];
	 int [] a2 = new int[256];
	 for(int i=0;i<s1.length();i++)
		 a1[s1.charAt(i)]++;
	 
	 for(int j=0;j<s2.length();j++)
		 a2[s2.charAt(j)]++;
	 int [] arr;
	 if(s1.length()>s2.length()) 
		arr =  processArrays(a1, a2);
	else 
		arr =  processArrays(a2, a1);
	int count=0;
	for(int i=0;i<arr.length;i++)
		if(arr[i]!=0)
			count++;
	 Arrays.sort(arr);
	 return count;
	 
 }
 
 //the second int array is supposed to be the smaller one 
 public static int[] processArrays(int[] a1, int [] a2) {
	 for(int i=0;i<a2.length;i++) {
		 if(a2[i]!=0 && a2[i] == a1[i])
		 {
			 a2[i]= 0;
			 a1[i] = 0;
		 }
	 }
	 return a1;
 }
 
 //geeks solution
 public static int method2(String s1, String s2) {
	 
 }
	public static void main(String[] args) {
		String s1 = "cddgk";
		String s2 = "gcd";
       System.out.println("Result: "+removeMinCharacters(s1, s2));
	}

}
