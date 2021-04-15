package Geeks.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * https://app.filtered.ai/interview/playground/coding
 * Degree of the array. So basically we'll be getting a string which consist of numeric value. We have to treat each character
 * as an individual numeric value i.e an array element. The max occurrence of a particular element will be returned as the degree
 * of the array. In the below example in the main method, the degree of array will be 2 given the string [1,2,2,3,1] because 
 * occurrence of 2 is 2 and MAX in this case.
 * 
 */
public class Degree_Of_Array {

	 public static void main(String args[] ) throws Exception {
	        String str = "12231";
	        System.out.println(codeHere(str));
	    }
	    public static String codeHere(String inputData) {
	       HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	      ArrayList<Integer> li = new ArrayList<Integer>();
	       int count = 0;
	       for(int i=0;i<inputData.length();i++){
	           int j = Character.getNumericValue(inputData.charAt(i));
	           System.out.println("    "+j);
	           if(map.containsKey(j)){
	               count = map.get(j);
	               count++;
	               map.put(j, count);
	           }
	           else
	           map.put(j, 1);
	       }
	       
	       for(Map.Entry<Integer, Integer> set: map.entrySet()) 
	    	   li.add(set.getValue());  
	       Collections.sort(li);
	       
	       System.out.println(li);
	       return Integer.toString(li.get(li.size()-1));
	        //return inputData;
	    }

}
