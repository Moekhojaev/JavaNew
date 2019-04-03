package com.studyonyourown;
import java.util.*;
public class EvenOddNumber {

	public static void main(String[] args) {
		int num=0;
	 Scanner evenOdd= new Scanner(System.in);	
    System.out.println("Please enter an any to see if it's odd or even");
	 num=evenOdd.nextInt();
	 if (num%2==0) {
		 
		 System.out.println("Your number is even");
		 
	 }else {
		 
		System.out.println("Your number is odd ");
	 }
	
	
	
	
	}
	
}
