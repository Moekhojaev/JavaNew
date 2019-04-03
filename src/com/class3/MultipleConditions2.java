package com.class3;

public class MultipleConditions2 {

	public static void main(String[] args) {
		int num1=23;
		int num2=23; 
		
		if (num1==num2) {
			
			System.out.println("Num1 is equal to Num2");
		}else if (num1>num2) {
			System.out.println("Num1 is larger than Num2");
		}else if (num1<num2) {
			System.out.println("Num1 is less than Num2");
		}else {
			
			System.out.println("This whole thing is wrong");
		} 
			
		
		
	}
}
