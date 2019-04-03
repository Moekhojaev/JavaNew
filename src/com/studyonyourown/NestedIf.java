package com.studyonyourown;
import java.util.*;
public class NestedIf {
	public static void main(String[] args) {
		/**  write a program to check work eligibility* 
		 *  if user is younger than <16 --> not allowed to work*  otherwise --> allow to work.
		 *   if user is younger than 64--> go to work
		 * *   otherwise --> enjoy your life*/
		
		int age=0;
		Scanner inpt = new Scanner(System.in);
		System.out.println("Please enter your age");
		age=inpt.nextInt();
		
		if(age<16) {
			System.out.println("Not allowed to work ");
		}else if (age>64) {
			
			System.out.println("Enjoy your life sir");
		}else {
			System.out.println("You can work man");
		}
		
		/**  declare variable for gpa and having a diploma
		 * *  if user has a diploma-> congratulations --> if gpa is higher 3.5-->
		 *  hire person
		 *  * else do not hire.*/
		double gpa=3.4;
		boolean diploma=true;
		
		if (diploma) {
			System.out.println("Congrats");
			
			if(gpa>3.5) {
				
				System.out.println("You got the job");
			}else {
				
				System.out.println("We can't hire you");
			}
		}else {
			System.out.println("Go get your diploma");
		}
		/** take 2 numbers from a user and 
		 * compare those numbers */
		
		int num1,num2;
		Scanner input =new Scanner(System.in);
		System.out.println("Please enter two numbers to compare");
		num1=input.nextInt();
		num2=input.nextInt();
		
		if(num1<num2) {
			System.out.println(num1+ " is less than "+ num2);
			
		}else if(num1>num2) {
			System.out.println(num1+" is greater than "+num2);
			
		}else {
			System.out.println(num1+" and "+num2+" are equal");
		}
		/** Create a Java program and store variables to store mortgage rate and mortgage 
		 * * price. First program should check if rate is higher than 4.5 user will not 
		 * * buy a house, otherwise user will consider buying. Once user decides to buy a * house,
		 *  if price of the house is larger than 200000 than user will take a 
		 *  * loan, otherwise user will pay cash. */
		
		double moragaRate;
		int price;
		
		Scanner src= new Scanner(System.in);
		System.out.println("Enter mortage rate");
		moragaRate=src.nextDouble();
		
		if(moragaRate<4.5) {
			
			System.out.println("Good now enter the price of the house");
			
			System.out.println("Enter the price of the house");
			price=src.nextInt();
			
			
			if (price<200000) {
				System.out.println("You can pay cash");
				
			}else {
				System.out.println("Take a loan");
			}
		}else {
			
			System.out.println(" You can't buy the house ");
		}
		
		
	}

}
