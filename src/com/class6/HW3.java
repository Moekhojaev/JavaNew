package com.class6;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		
		Scanner input;
		int num1, num2, result=0;
		 
		
		input=new Scanner(System.in);
		
		System.out.println("What's your first number?");
		num1=input.nextInt();
		System.out.println("What's your second number?");
		num2=input.nextInt();
		System.out.println("What operation you are trying to achieve?(+ - / *)");
	
		char operator=input.next().charAt(0);
		
		switch (operator) {
		
		case'+':
			result= num1 + num2;
			break;
		case '-':
			result= num1-num2;
			break;
		case '*':
			result= num1*num2;
			break;
		case'/':
			result=num1/num2;
			break;
			
		default:
			System.out.println("Can't solve it ");
		
		
		}
		
		System.out.println("The result of 2 numbers you input is " + result);	
			
		}
	
		
		}
	

