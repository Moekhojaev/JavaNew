package com.studyonyourown;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {

		// Create a program that will take a boolean value from a user make the variable
		// isTrue.
		// * if the input is TRUE or FALSE then output should read.First Output:
		// "Input the boolean value"Final Output:
		// "The value is ______" */

	  
		boolean ask;
		Scanner inpt=new Scanner(System.in);
		System.out.println("Is it raining, asnwer eaither True or False");
		
		ask=inpt.nextBoolean();

		if(ask==true) {
			System.out.println("The value is " + ask);
		}else {
			
			
			System.out.println("The value is "+  ask);
		}
		
	//////////////////////////////////////////////////////////////	
		/*Ask user to enter age and based on the age we will print: 
		 * * if age is older than 1 but less then 3--> baby 
		 * * if age is older than 3 but less then 5--> toddler * 
		 * if age is older than 5 but less then 13--> kid * 
		 * if age is older than 13 but less then 20--> teenager 
		 * * if age is older than 20 but less then 64--> adult 
		 * * if age is older or equal to 64--> senior */
		
		
		int age=0;
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter yout age?");
		age=scr.nextInt();
		
		if (age>=1 || age<3) {
			System.out.println("you are a baby");
			
			
		}else if (age>=3 || age<5) {
			
			System.out.println("you are a toddler");
		}else {
			
			System.out.println("You are everything");
			
		}
	/////////////////////////////////////////????/////////////////////////////
		/*
		 * 
		 */
		/*if number is between 1-10 -->number is small 
		 * * if number is between 11-100--> number is medium 
		 * * if number is between 101 -1000--> number is large*/
		
	  int num=13;
	  
	  if (num==1 && num<=10) {
		  System.out.println(num+"it is a small number");
		  
	  }if (num==11 && num<=100) {
		  
		  System.out.println(num+" this number is a medium size ");
	  }if (num==101 && num<=1000) {
		  
		  System.out.println(num+"this is a large number");
	  }else {
		  
		  System.out.println("It's a big number");
	  }
	/*
	 * 	
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	  /*check if user has credit card--> 
	   * * check what is the balance if balance is more than 1000--> pay off now
	   *  * else "you are good"*/
		boolean credit=true;
		int balance=1200;
		
		if(credit) {
			System.out.println("I see you got a credit hahah");
			
			if(balance>1000) {
				System.out.println("Pay the rest ");
			}else {
				System.out.println("\n"+"You good stop tripping");
			}
		}else {
			
			System.out.println("Do you want to open a credit");
		}
	  
	}

}
