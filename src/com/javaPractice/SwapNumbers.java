package com.javaPractice;

public class SwapNumbers {

	public static void main(String[] args) {
		/* Write a program to swap 2 numbers without a temporary variable? 
	      * Swap  2 strings without a temporary variable?
		  */
		int a=10; 
		int b=20;
	   a=a+b;
	   b=a-b;
	   a=a-b;
	   System.out.println("a is: "+a);
       System.out.println("b is: "+ b);
       /*
        * 1st way to swap 
        */
       String src= "Hello";
       String qwe = "World";
       src = src+qwe;
       qwe = src+qwe;
       src =src.substring(5);
       qwe = qwe.substring(0,5);
       System.out.println("the output of src is : "+ src);
       System.out.println("the output of qwe is :" +qwe);
       /*
        * 
        */
       String word1 = "Hello";
       String word2 = "World";
       System.out.println("The output of word1 is "+ word1.replace("Hello","World"));
       System.out.println("The output of word1 is "+ word2.replace("World", "Hello"));

}
}