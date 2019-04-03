package com.studyonyourown;

import java.util.Scanner;

public class class9point2 {

	public static void main(String[] args) {
		// Ask user to enter the item they want to buy and the price for the item. Then
		// ask user to pay for it. Every time user enters money accumulate the amount
		// and tell user how much is left to pay off the amount. Whenever user done with
		// payments tell them "Thank you for shopping!"
	
		int price, amount,total=0;
		String item;
	  Scanner inpt=new Scanner(System.in);
		System.out.println("Please enter what item you would Like to purchase");
		item=inpt.nextLine();
		System.out.println("Please enter the price of the item");
		price=inpt.nextInt();
		System.out.println("Your total is "+ price);
		do {
		System.out.println("How much would you like to pay?");
		amount=inpt.nextInt();
		total=total+amount;
		
		if (amount<price) {
		 
			System.out.println("You owe us "+ (price-total));
		}else if (amount>price) {
			System.out.println("We owe you"+ (total-price));
		}
			break;
		
		}while(amount!=price) ;
		
		System.out.println("Thank you for shopping. Come back !!!");

	}
}
