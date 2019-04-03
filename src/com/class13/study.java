package com.class13;
import java.io.*;
public class study {

	public static void main(String[] args) {
	/*
	 * 1
	 */
		int a,b;
		a=10;
		b=20;
		System.out.println("Print a: "+a+" and prind b: "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Print value of a after swap "+ a +" and print value of b "+ b);
	/*
	 * 2
	 */
		int array[] = { 10, 20,30,60,90,100};
		int largest = array[0];
		int secondLargest = array[0];
		
		for (int i = 0; i < array.length; i++) {
 
			if (array[i] > largest) {
				secondLargest = largest;
				largest = array[i];
 
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];
 
			}
		}
 
		System.out.println("Second largest number is:" + secondLargest);
 /*
  *3
  */
		String str="Hello world";
		int size=str.length();
		System.out.println(size);
	/*
	 * 4
	 */
		String inpt="Syntaxtechs class 2019";
		boolean qwerty=inpt.startsWith("Syntaxtechs");
		qwerty=inpt.endsWith("2019");
		System.out.println(qwerty);
	/*
	 * 5			
	 */
		
		String src = "Joe, Jay, James, Jayden, Jimmy";
		int len =src.length();
		System.out.println(len);
		System.out.println(src.charAt(1));
		System.out.println(src.toUpperCase());
		System.out.println(src.toLowerCase());
		System.out.println(src.contains("James"));
		System.out.println(src.replace('J', 'K'));
		System.out.println(src.substring(10));
		System.out.println(src.substring(0,1)+" "+ src.charAt(0));
		System.out.println(src.trim());
		System.out.println(src.contains("Jay"));
		System.out.println(src.isEmpty());
		char[] ch= src.toCharArray();
		for (char ck:ch) {
			System.out.print(ck+" ");
			
	   
	    
		}
		
		
	}

}
