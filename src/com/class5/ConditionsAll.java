package com.class5;

import java.util.Scanner;

public class ConditionsAll {
	
	public static void main(String[] args) {
		Scanner scan; 
		boolean sale; 
		int discount,price;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter price of the item");
		price=scan.nextInt();
		System.out.println("Let's check all discount");
		
		if (price<20) {
			discount=20;
			finalPrice= price-(price*0.2);

		}else if (price>=20 && price<100) {
			discount=30;
			finalPrice=price-(price*0.3);
			
			
		}else {
			discount =75;
			finalPrice= price-(price*0.75);
		
			
		}
		System.out.println("Final price is"+ finalPrice);
		
		
	}

}
