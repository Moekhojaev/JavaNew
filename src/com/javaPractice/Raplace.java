package com.javaPractice;

public class Raplace {

	public static void main(String[] args) {
		String str1="12Hello 3234 World 465";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);

String newString = str1.replaceAll("[A-Z a-z]", " ");
System.out.println(newString);
System.out.println(str1.replaceAll("[^0-4]",""));
System.out.println(str1.replace("Hello","World"));	
	}
	

}
