package Geeks.String;

import java.util.Arrays;

/*
 * program-sort-string-descending-order
 * 
 */
public class Program_sort_string_descending_order {
public static void sort(String s) {
	int[] chars = new int[26];
	for(char c: s.toCharArray())
		chars[c-'a']++;
	
	System.out.println(Arrays.toString(chars));
	
	
	String str="";
	
	for(int i=chars.length-1;i>=0;i--) 
		if(chars[i]!=0) 
			for(int j = chars[i];j>0;j--) 
				str+=(char)('a'+i);
				
	System.out.println("result: "+str);		
		
	}
	
	public static void main(String[] args) {
		String str = "alkasingh";
		// output: snlkihgaa
		sort(str);
        sort("nupursingh");
        //output: uusrpnnihg
	}

}
