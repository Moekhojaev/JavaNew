package com.studyonyourown;

public class Class10 {

	public static void main(String[] args) {
		int[] array = new int[3]; // first way
		array[0] = 10;
		array[1] = 11;
		array[2] = 12;
		System.out.println(array[0]);

		// Second way
		int[] arrays = { 20, 40, 50, 60 };
		System.out.println(arrays[1] + "\n" + (arrays[2]));
		// Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		// grade B (use 2different ways of creating an array).

		char[] abc = new char[6];
		abc[0] = 'A';
		abc[1] = 'B';
		abc[2] = 'C';
		abc[3] = 'D';
		abc[4] = 'E';
		abc[5] = 'F';
		System.out.println(abc[5]);
		/*
		 * 2nd way
		 */
		char[] alph = { 'A', 'B', 'C', 'D', 'E', 'F', };
		System.out.println(alph[2]);
		// Create an array of names and store all names of your group. Then print your
		// name from that array. (use 2 different ways of creating an array).

		String inpt[] = new String[5];
		inpt[0] = "Moe";
		inpt[1] = "Sheyh";
		inpt[2] = "Alaiksei";
		inpt[3] = "Inna";
		inpt[4] = "Toly";
		System.out.println(inpt.length);
		System.out.println(inpt[2]);
		// 2nd way

		String inpts[] = { "Moe", "Sheyh", "Alaiksei", "Inna", "Tony'" };

		for (int i = 0; i < inpts.length; i++) {
			System.out.println(inpts[i] + " ");// PRINT EVERYTHING IN ARRAY

			char[] alpahabet = { 'A', 'B', 'C', 'D', 'E' };

			for (int c = 0; c < alpahabet.length; c++) {
				System.out.print(alpahabet[c]);
			}
			System.out.println();
			// USE while loop to print everything in array

			String[] str = { "Moe", " Money", " Future", " Billionaire" };

			int klm = 0;
			while (klm < str.length) {
				System.out.print(str[klm]);
				klm++;
			}
			break;

			/*
			 * * Write a program that reads a range of integers (start and end point), *
			 * provided by a user and then from that range prints the sum of the even and *
			 * odd integers.
			 */
			
			
			
		}

	}
}
