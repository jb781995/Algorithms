package Geeks.String;

import java.util.Arrays;

public class String_Reverse {
//approach-1: recursion	
  public static void reverse(String s) {
	  if(s==null || s.length()<=1) 
		  System.out.println(s);
	  else {
		  System.out.print(s.charAt(s.length()-1));
		  reverse(s.substring(0, s.length()-1));
	  }
  }
  
  public static String reverseRecur(String s, String result) {
	  if(s==null || s.length()<=0) {
		 return result;
	  }
	  else {
		  //System.out.print(s.charAt(s.length()-1));
		  result+=s.charAt(s.length()-1);
		  return reverseRecur(s.substring(0, s.length()-1), result);
	  }
  }
  
//approach-2: by swapping characters
  // https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/
  public static void reverse2(String str) {
	  int i=0, n= str.length()-1;
	  char [] chArr = str.toCharArray();
	  while(i<str.length()/2) {
		 char c = chArr[n];
		 chArr[n] = chArr[i];
		 chArr[i] = c;
		 i++;
		 n--;
		}
	  System.out.println("result: "+Arrays.toString(chArr));
	  System.out.println(new String(chArr));
  }
  
  //approach-3
  
	public static void main(String[] args) {
		String s = "Meera";
		//reverse2(s);
		//System.out.println("\n\n\n\nresult:"+reverseRecur(s, ""));
	
		
	}

}
