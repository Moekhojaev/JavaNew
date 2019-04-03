package com.studyonyourown;
import java.util.Scanner;
public class Class6 {

	public static void main(String[] args) {
		/* * Program to find largest number among three numbers using nested if
		 *  * provided by a user (numbers must be distinct) */	
		
		int num1,num2,num3,largest=0;
		Scanner input=new Scanner(System.in);
        System.out.println("input 3 number to find the largest number from 3 of them "); 
	    num1=input.nextInt();
	    num2=input.nextInt();
	    num3=input.nextInt();
	    
	    if(num1>num2 && num1>num3) {
	    	System.out.println(num1+"is the largest number");
	    	
	    }else if (num2>num1 && num2>num3) {
	    	
	    	System.out.println(num2 +"is the largest number");
	    }else if (num3>num1 && num3>num2) {
	    	System.out.println(num3+" is the largest number");
	    	
	    	
	    }else {
	    	System.out.println("They are all equal");
	    }
		
	    
	    /*/
	     * 
	     * 
	     */
	    
	  //if it is not snowing --> I will come to the class otherwise I will stay at home
	    
	    boolean snow=true;
	    
	    if(!(snow)) {
	    	System.out.println("I will come home");
	    	
	    }else {
	    	
	    	System.out.println("I will stay home ");
	    }
	    /*
	     * 
	     */
	    /*Prompt user to enter their country 
	     * * Based on the country --> specify favorite food */
	    
	    Scanner scr=new Scanner(System.in);
	    System.out.println("Where you from?'");
	    String country=scr.nextLine();
	    switch (country) {
	    case "tajikistan":
	    	System.out.println("Your favorite food is pilav");
	    	break;
	    
	    case "uzbekistan":
	    	System.out.println("Your favorite food is osh");
	    	break;
	    	
	    case "turkey":
	    	System.out.println("Your favvorite food is nothhing");
	    	break;
	    default:
	    		
	    System.out.println("Please enter a good country");
	     break;
	     /* * Write a program that prints out if it is good weather to go for any activity * or not 
	      * * * If the temperature is between 40 degrees and 80 degrees inclusive & no * rain--> 
	      * we will go for hiking otherwise--> we will not go hiking If * temperature is between 25 and 40 inclusive & snowing 
	      * -->going snowboarding 
	      * * otherwise we are not going snowboarding it if temperature is more than 80 & 
	      * * sunny--> go to the beach otherwise --> not go to the beach */
	    }
	   
	    
	    
		}

	}
	
	
	

