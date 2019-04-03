package com.class2;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int a = 30;
		int b = 15;

		int sum = a + b;
		int subs = a - b;
		int mult = a * b;
		int div = a / b;

		System.out.println("The addition of 2 numbers is " + sum + "\n"+ "The subturuction of 2 numbers is " + subs
		+ "\n"+ "The multiplication of 2 numbers is " + mult
				+ "\n" + "The division of 2 numbers is " + div + ".");

		// task with doubles

		String NewTask1 = "Task with Doubles";

		System.out.println("\n" + NewTask1 + "\n");

		double c = 3.11;
		double f = 2.88;

		double summ = c + f;
		double subtracts = c - f;
		double multip = c * f;
		double divv = c / b;

		System.out.println("The addition of numbers is " + summ + 
				"The multiplication of 2 numbers is " + multip + "\n" + "The division of 2 numbers is " + divv
				+ ".");

		String NewTask2 = "Task with Squares";

		System.out.println("\n" + NewTask2 + "\n");

		double aa = 3.9;
		double square = aa * aa;

		System.out.println("The square of the " + aa + "is" + square + ".");

		String NewTask3 = "Task with Perimeters1 and Area";

		System.out.println("\n" + NewTask3 + "\n");
		
		
		double width = 5;
		double  height = 8;
		
		double area  = width*height; 
		double perimeter = 2 *(width+height);
		
		System.out.println("The perimeter of rectangle with width=5 and height =8 is" + perimeter + "\n" + "The area of rectangle is " +area+ ". ");
		
				

	}

}
