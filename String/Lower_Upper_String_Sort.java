package Geeks.String;

import java.util.Arrays;

/*
 * https://www.geeksforgeeks.org/alternate-lower-upper-string-sort/
 */
public class Lower_Upper_String_Sort {
public static void alternateUpperLower(String s) {
	int n= s.length();
	int [] u= new int[26];
	int [] l= new int[26];
	char[] s1 = s.toCharArray();
	for(char c: s.toCharArray()) {
		if(Character.isUpperCase(c))
		u[c-'A']++;
		else
		l[c-'a']++;
	}
	
	int i = 0, j = 0, k = 0; 
	int[] uArr = u;
	int[] lArr = l;
	System.out.println(""+Arrays.toString(u)+"\n"+Arrays.toString(l)+"\n\nduplicates: \n"+Arrays.toString(uArr)+"\n"+Arrays.toString(lArr));
	while(k<n) {
		while(i<26 && u[i]==0) {
			i++;
			//System.out.println("i incremented till index: "+i);
		}
		
		if(i<26) {
			s1[k++] = (char)('A'+i);
			u[i]--;
		}
		
		while(j<26 && l[j]==0)
			j++;
		//System.out.println("i incremented till index: "+i);
		if(j<26) {
			s1[k++] = (char)('a'+j);
			l[j]--;
		}
	}

	System.out.println(new String(s1));

	
}
	public static void main(String[] args) {
		/*
		 * Input : bAwutndekWEdkd
Output :AbEdWddekkntuw
Explanation:
Here we can see that letter ‘A’, ’E’, ’W’ are sorted 
as well as letters “b, d, d, d, e, k, k, n, t, u, w” are sorted 
but both appears alternately in the string as far as possible.
		 */
		//alternateUpperLower("bAwutndekWEdkd");
		String str="";
		int upp=0;
		str+=(char)(upp+'A');
		System.out.println("str: "+str);
		upp=1;
		str+=(char)(upp+'A');
		System.out.println("str: "+str);
		alternateUpperLower("bAwutndekWEdkd");
	}

}
