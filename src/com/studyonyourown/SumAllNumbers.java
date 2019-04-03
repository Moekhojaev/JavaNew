package com.studyonyourown;
import java.util.Scanner;
public class SumAllNumbers {
public static void main(String[] args) {
	/*find sum of all even numbers from 1 to 100 inclusive*/
	int sum=0;
	for(int a=1; a<=100; a++ ) {
		if(a%2==0) {
		sum+=a;	
			
		}System.out.println(sum);
		
	}
	
	/* let user define a range of numbers to print */
	int num1, num2;
	Scanner range=new Scanner(System.in);
	System.out.println("Please enter starting and ending num");
	num1=range.nextInt();
	num2=range.nextInt();
	if(num1<num2) {
	for (int i=num1; i<num2; i++) {
		System.out.println(i);
		
	}}else {
		System.out.println("Not eligible ");
	}
	
			
}
}
