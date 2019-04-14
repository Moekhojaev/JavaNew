package com.Class151;
import java.util.Scanner;
public class primeNumber {

	public static void main(String[] args) {
		
		/*
		  * Write a java program to check whether a given number is prime or not?
		 * PrimeNumber should be divisible by 1 and itself only
		 */
		System.out.println("Enter intiger to check wether it's prime or not");
		int num;
		boolean prime=true;
		Scanner inpt= new Scanner(System.in);
		num=inpt.nextInt();
		
		for (int i=2; i<num; i++) {
			if (num%i !=0) {
				
			}else {
				prime=false;
			}
		}System.out.println(prime);
	/*	for( int i = 2; i<number; i++) {
			 if (number% i !=0) {
				
			 }else {
				prime = false ;
			 }*/
		
	}
}
