package com.class201;

public class Task2 {
	public static void main(String[] args) {
		Task2 str=new Task2();
    String [] array= str.words("Muhammad Khojaev good night");
		for (String a:array) {
			System.out.print(a+ " ");
		}
	}
	
private String[] words (String std) {
	
	String [] wrd= std.split(" ");
	return wrd;
}

	
}
