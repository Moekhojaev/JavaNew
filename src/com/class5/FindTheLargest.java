package com.class5;

import java.util.Scanner;

public class FindTheLargest {
	public static void main(String[] args) {

		double num1, num2, num3;
		Scanner input;

		input = new Scanner(System.in);
		System.out.println("Please enter your first number");
		num1 = input.nextDouble();
		System.out.println("Please enter your second number");
		num2 = input.nextDouble();
		System.out.println("Please enter your third number");
		num3 = input.nextDouble();

		if (num1 > num3 && num1 > 3) {

			System.out.println(num1 + " is the largest number");
		} else if (num2 > num1 && num2 > num3) {

			System.out.println(num2 + " is the largest number");
		} else {
			System.out.println(num3 + " is the largest number");
		}

	}
}
