package com.class9;
import java.util.Scanner;
public class Tas2 {
	public static void main(String args[]) {
		String item;
		int pricefitem, pay=0;
		
		Scanner scr= new Scanner(System.in);
		System.out.println("What do you want to buy and what's the price");
		item=scr.nextLine();
		pricefitem=scr.nextInt();
		System.out.println("Your total is "+ pricefitem);
		System.out.println("How much do you want to pay?");
		pay= scr.nextInt();
		System.out.println("Your change is  " +(pay-pricefitem));
		System.out.println("Thank you for shopping with US");
		
		
		
		
		
	}
	//Ask user to enter the item they want to buy and  the price for the item. 
	//Then ask user to pay for it. Every time user enters money accumulate the amount and tell user how much is 
	//left to pay off the amount. Whenever user done with payments tell them "Thank you for shopping!"

}
