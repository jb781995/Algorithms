package Geeks.String;

import java.util.Arrays;
import java.util.LinkedList;

/*
 * https://www.geeksforgeeks.org/given-a-sequence-of-words-print-all-anagrams-together-set-2/
 */
public class All_Anagrams {
  private static int chars = 26;
  static class TrieNode{
	  boolean isEnd; // indeicates end of word
	  TrieNode[] child = new TrieNode[chars];
	  //head of the linkedlist
	  LinkedList<Integer> head;
	  
	  TrieNode() {
		  isEnd = false;
		  head= new LinkedList<Integer>();
		  for(int i=0;i<chars;i++)
			  child[i] = null;
	  }
  }
  
  //utility function to insert a word to the tree
  public static TrieNode insert(TrieNode root, String s, int index, int i) {
	  if(root==null)
		  root = new TrieNode();
	  if(i<s.length()) {
		  int index1 = s.charAt(i) - 'a';
		  root.child[index1] = insert(root.child[index1], s, index, i+1);
	  }
	  else { //if end of the word reached
		  //insert index of this word ro end of index linked list 
		  if(root.isEnd==true)
			  root.head.add(index);
		  else {
			  //if index list is empty
			  root.isEnd = true;
			  root.head.add(index);
		  }
	}
	  return root;
	  	
  }
  public static void printAnagramsTogether(String[] words, int n) {
	  TrieNode root= null;
	  //iterate through all input words
	  for(int i=0;i<n;i++) {
		  //create a buffer for this word and copy this word to the buffer
		  char[] buffer = words[i].toCharArray();
		  //sort
		  Arrays.sort(buffer);
		  //insert sorted buffer and its original index to Trie
		  root = insert(root, new String(buffer), i, 0);
	  }
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
