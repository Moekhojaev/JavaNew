package com.studyonyourown;

import java.util.Scanner;

public class class9 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.println(i + " " + j);
			}
		}
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */
		int num1, num2, sumODD = 0, sumEven = 0;
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter 2 intigers");
		num1 = num.nextInt();
		num2=num.nextInt();
		if (num1<num2) {
			
			for (int a=num1; a<num2; a++) {
				
				if(a%2==0) {
					sumEven=a;
				}else if (a%2!=0) {
					sumODD=a;
				}
			}
			
			
			
		}System.out.println(sumEven);
System.out.println(sumODD);
}
	

}
