package com.Class151;

public class reverse {

	public static void main(String[] args) {
		/*
		 * Write a java program to reverse String? 
		 * Reverse a string word by word?
		 */
    String name = "Today is a good day";
    String reverse = " ";
    String spilt=" ";
    char[] array= name.toCharArray();
  
    for (int i= array.length-1; i>=0; i--) {
    	reverse+=array[i];
    	
    	
    	
    }System.out.println(reverse);
    

	}

}
