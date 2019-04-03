package com.class4;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name");

		String name = scanner.nextLine();

		System.out.println("Good Morning " + name);

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your age ");

		int age = scan.nextInt();

		System.out.println("Your age is " + age);

	}
}
