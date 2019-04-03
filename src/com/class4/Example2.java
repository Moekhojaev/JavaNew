package com.class4;

import java.util.Scanner;

public class Example2 {
 public static void main(String[] args) {
	
	 int age; 
	 
	Scanner input= new Scanner(System.in);
	
	System.out.println("What's your age ?");
	
	age=input.nextInt();
	
	if(age>18) {
		
		System.out.println("You are eligible to get DMV license");
		
		
	} else {
		
		
		System.out.println("Sorry you can't be issued a DMV license");
		
	}
	
	
	 
	 
}
}
