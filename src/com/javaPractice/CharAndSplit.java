package com.javaPractice;

public class CharAndSplit {

	public static void main(String[] args) {
	String name = "Syntax Technologies";
	char [] array = name.toCharArray();
	System.out.println(array.length);
	for (int i=0; i<array.length; i++) {
		System.out.print(array[i]);
	}System.out.println();
	for (int i=array.length-1; i>=0; i--) {
		System.out.print(array[i]);
	}
		/*
		 * Split String
		 */
	String subject ="I love java and I want to learn more";
	String [] a = subject.split(" ");
	System.out.println("\n"+ a.length);
	
	for (int i=0; i<a.length; i++) {
		System.out.print(a[i]);
	}
	
	
	}

}
