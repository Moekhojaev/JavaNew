package com.class15;
import java.io.*;
public class IQ1 {
	
	public static void main(String[] args) {
     /* Write a program to swap 2 numbers without a temporary variable? 
      * Swap  2 strings without a temporary variable?
	  */
		int a =10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+a);
		System.out.println("b: "+ b);
		
		String c="hello";
		String d="World";
		
		c=c+d; // HelloWorld
	    d=c.substring(0, c.length()-d.length());
	    c=c.substring(d.length());
	    System.out.println("The value of c is " +c+" value of d "+ d );
	  
	    /*
	     * 2nd way swap
	     * 
	     */
	    String str = "Best";
        String str1 = "Group";

        System.out.println("After swap str is: " + str.replace("Best", "Group"));
        System.out.println("After swap str1 is: " + str.replace("Group", "Best"));

	
	}	

}
