package com.class4;

import java.util.Scanner;

public class Example1 {
 
	public static void main(String[] args) {
	
		int num1;
		Scanner loan=new Scanner(System.in);
		System.out.println("How Much Do you need?");
		
		num1=loan.nextInt();
		
		if (num1<200000) {
			
			System.out.println("Congratulations you have been accapted");
			
			
		}else {
			
			System.out.println("Sorry we cant loan you the amount you entered");
			
		}
		
	 
	 
	 
	 
	 
};
}
