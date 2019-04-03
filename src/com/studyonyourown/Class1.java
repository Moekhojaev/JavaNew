package com.studyonyourown;

public class Class1 {

	public static void main(String[] args) {

		double radius, area; // FIND Radius

		 radius = 20;

		area = (radius * 2) * 3.14159;

		System.out.println("The area with " + radius + " is " + area);

		radius = 10;

		System.out.println(radius);
/////////////////////////////////////////////////////////////////////////////////////////////
	
	
		final int b=12; //Final - means that constant can't be changed
		
		System.out.println(b);
/////////////////////////////////////////////////////		
		double  div; 
		
		div= 5.0/2;
		System.out.println(div); // Prints  it WITH a Reminder 2.5 
	  
		
		int a=10;
		int newNum=10* ++a; 
	 System.out.println(newNum);
	 
	 ////////////////////////////////////////////////////////////////
	char ch='a';
	System.out.println(++ch);
	
	System.out.println("He said\" Java is\"fun"); // Prints He said "Java is fun"
	}
}
