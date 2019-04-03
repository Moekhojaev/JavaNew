package com.class8;

import java.util.Scanner;

public class NumbersInBetween {

	public static void main(String[] args) {
		
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter a starting number");
//		int startNumber=scan.nextInt();
//		System.out.println("Please enter an ending number");
//		int endNumber=scan.nextInt();
//		if(startNumber>endNumber) {
//			
//			for(int i= startNumber; i<=endNumber; i++) {
//				
//				System.out.println(i);
//			}
//		}else {
//			
//			System.out.println("I cant run your code");
//		}
		
		  Scanner scan = new Scanner(System.in);

	        System.out.println("Please enter a starting number");
	        int startNumber = scan.nextInt();

	        System.out.println("Please enter ending number");
	        int endNumber = scan.nextInt();

	        if (startNumber > endNumber) {

	                for (int i = startNumber; i <= endNumber; i++) {
	                    System.out.println(i);
	                }
	            
	        } else {
	            System.out.println("I won't run your code");
	        }
		

	}

}
