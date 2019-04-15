package com.CrateStrings12;

public class CharAT {

	public static void main(String[] args) {
	
		String str= "Student"; //returns certain character
		System.out.println(str.charAt(0));
		
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+ " ");
		}
System.out.println();
		System.out.println("----------INDEXOF---------------");
		//Returns index of specified character
		
		String str1= "Sunday funday";
		System.out.println(str1.indexOf("n"));
	System.out.println(str1.indexOf("w"));
	// 
	System.out.println("--------------    ----------------");
	String  str2= "Monday clubday";
	System.out.println(str2.substring(2,8));
	// 
	String m="Muhammad";
	System.out.println(m.indexOf("m"));
	
	}
	

}
