package com.javaPractice;

public class FormatingConsoleOutPut {

	public static void main(String[] args) {
		int count = 5; 
		double amount = 45.56;
		String organic = "Muhammad";
		System.out.printf("count is a %d and amount is %f and string is %s",count, amount,organic);
        String s = String.format("\ncount is %d and amount is %f", count, amount);
	System.out.println(s);
	}

}
