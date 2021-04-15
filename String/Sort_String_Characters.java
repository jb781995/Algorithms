package Geeks.String;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/sort-string-characters/
 */
public class Sort_String_Characters {
public static void sortStringChars(String s) {
	int[] ch = new int[255];
	String result = "";
	//method-1 of keeping the chars count. NOT SO EFFICIENT
	for(int i=0;i<s.length();i++)
		ch[s.charAt(i)]++;
	System.out.println(Arrays.toString(ch));
	
	//method-2 of keeping chars count.. Ohh yeah...
	int[] ch2 = new int[26];
	for(char c: s.toCharArray())
		ch2[c-'a']++;
	System.out.println(Arrays.toString(ch2));
	for (int i = 0; i < 26; i++) { 
        for (int j = 0; j < ch2[i]; j++) { 
            System.out.print((char) (i + 'a')); 
        } 
    } 
}
	public static void main(String[] args) {
		// bbccdefbbaa 
		sortStringChars("bbccdefbbaa");
	}

}
