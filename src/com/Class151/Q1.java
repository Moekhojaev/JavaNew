package com.Class151;

public class Q1 {

	public static void main(String[] args) {
		/* Write a program to swap 2 numbers without a temporary variable? 
	      * Swap  2 strings without a temporary variable?
		  */
		int a= 10; 
		int b=20; 
		a=a+b;
		b=a-b; 
		a=a-b;
		System.out.println("the output of b after swap is "+ b);
		System.out.println("the output of a after swap is "+a);

		String name1= "Mother";
		String name2= "Father"; 
		
		name1=name1+name2;
		name2= name1+name2;
		System.out.println("name oune is "+ name1.substring(6));
		System.out.println("name oune is "+ name2.substring(0,6));
		
		System.out.println("the out put of name1 after swap is "+ name1.replaceAll("Mother","Father"));
		System.out.println("the output of name2 afte swap is "+ name2.replaceAll("Father", "Mother"));
	}

}
