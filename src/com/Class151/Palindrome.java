package com.Class151;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		/* 
		 * Write a Java Program to find whether a String is palindrome or not?
		 */
		System.out.println("Enter a string to check if it's palindrome or not");
		Scanner inpt= new Scanner(System.in);
		String palindrome= inpt.nextLine();
		String reverse =""; 
		
		for (int i=palindrome.length()-1; i>=0; i--) {
			reverse+=palindrome.charAt(i);
		}System.out.println(reverse);
		if (palindrome.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palindrome");
		}else {
			System.out.println("The word isn't palindrome");
		}

	}

}
