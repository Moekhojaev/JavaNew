package com.class2;

public class VariableChanges {

	public static void main(String[] args) {

		String name = "muhammad";
		name = "moe";
		String lastName = "Khojaev";
		lastName = "Mores";
		char grade = 'B';
		// char grade='A'; do not work

		grade = 'A';

		String city = "Fairfax";

		city = "NewYork";

		System.out.println(grade);

		System.out.println(city);
		System.out.println(name);
		System.out.println(lastName);
	}

}
