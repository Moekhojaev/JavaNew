package com.studyonyourown;
import java.util.Scanner;
public class Class5 {

	public static void main(String[] args) {
		/* * Ask user to enter price and boolean value for sale Based on the sale we will 
		 * * check the price: if price<20 --> apply discount 20% and give final price if 
		 * * price is >=20 less 100--> apply discount 30% and give final price if price is
		 *  * >100 less 500--> apply discount 50% and give final price */
		boolean sale; 
		double price=0;
	    double total;
		Scanner inpt= new Scanner(System.in);
		System.out.println("Is there a sale ?"); 
		sale=inpt.nextBoolean();
		
		if (sale==true ) {
			System.out.println("There is a sale ");
			System.out.println("What's the price of the item");
			price=inpt.nextInt();
			
			if (price<=20) {
				total=price*0.2;
				System.out.println("The total discount is "+ total);
				
			}else if (price>20 && price<=100) {
				total=price*0.3;
				System.out.println("The total discount is"+ total);
			}else if (price>100 && price<=500){
				total=price*0.5;
			System.out.println("The total discount is "+ total);
			}else {
				System.out.println("Please enter a valid number");
			}
			
		}else {
			
			System.out.println("There is not a sale");
		}
	}

}
