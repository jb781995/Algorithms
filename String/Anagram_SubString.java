package Geeks.String;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/anagram-substring-search-search-permutations/
 */
public class Anagram_SubString {
 public static int anagramSubStringCount(String str, String pat) {
	 int count =0;
	 char [] pat_c = pat.toCharArray();
	 Arrays.sort(pat_c);
	 String pat_str = new String(pat_c);
	 int lim = str.length() - pat.length();
	 for(int i=0;i<=lim;i++) {
		 char [] c = str.substring(i, i+pat.length()).toCharArray();
		 Arrays.sort(c);
		 System.out.println(""+Arrays.toString(c)+"    "+pat_str);
		 if(new String(c).equals(pat_str)) 
          count++;
	 }
	 
	 return count;
 }
	public static void main(String[] args) {
		String str = "BACDGABCDA";
		String pat = "DACB";
		System.out.println("....."+anagramSubStringCount(str, pat));


	}

}
