package com.class3;

public class RelationalOperators {
	public static void main(String[] args) {
		
		int a =198;
		int b= 198; 
		
		boolean result= a>b;
		 
		boolean result1= a==b;
		
		System.out.println(result);
		System.out.println(result1);
		
		// compare 2 numbers and if a is larger than b 
		
		if (a!=b) {
			
			System.out.println("Correct");
			
		}else {
			System.out.println("wrong");
			
		}
		
		// declare  price and if price is higher than expected price --> 
		// we will not buy it. 
		double shoePrice=19.99;
		double expectedPrice=11.99; 
		
		if (shoePrice<=expectedPrice) {
			
			System.out.println("I am buying those shoes");
			
		}else {
			
			System.out.println("I am not  buying those shoes");
		}
		
		System.out.println("Continue learning how to code");
		
		
	}

}
