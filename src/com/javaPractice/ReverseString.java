package com.javaPractice;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Write a java program to reverse String? 
		 * Reverse a string word by word?
		 */
		
		String sentence ="Hello World";
	String 	Reverse ="";
		for (int i = sentence.length() - 1; i>=0; --i) {
		Reverse+=sentence.charAt(i);	
		}System.out.println(Reverse);
		
		String [] words = Reverse.split(" ");
		  for (int i=words.length-1; i>=0; i--) {
		 System.out.print(words[i]+ " ");
		  }
		  }

}
