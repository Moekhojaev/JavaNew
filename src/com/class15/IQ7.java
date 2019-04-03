package com.class15;
import java.util.Scanner;
public class IQ7 {
	/*
	 *
	 * Write a java program to check whether a given number is prime or not?
	 * PrimeNumber should be divisible by 1 and itself only
	 */
  public static void main(String[] args) {
	 int  number;
	 boolean prime=  true ;
	 Scanner input = new Scanner(System.in);
	 System.out.println("Please enter any number to check if its a prime number or not");
	 number= input.nextInt();
	 for( int i = 2; i<number; i++) {
		 if (number% i !=0) {
			
		 }else {
			prime = false ;
		 }
	 } System.out.println(prime);
	  
	  
	  
}
}
