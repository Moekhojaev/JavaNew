package com.studyonyourown;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please write your name ");

		String name = scan.nextLine();

		System.out.println("Good morning " + name + "\n");

		Scanner y = new Scanner(System.in);

		System.out.println("How's your day " + name + "?");

		String z = y.nextLine();

		System.out.println("I am always here for you" + "\n");

		Scanner d = new Scanner(System.in);
		System.out.println("Btw  What did you do today " + name + "?");
		String f = d.nextLine();
		System.out.println("Thats good man\n");

		Scanner l = new Scanner(System.in);
		System.out.println("OK I will leave you alone ");
		String o = l.nextLine();
		System.out.println("You have a good one man " + name + "\n");

		Scanner q = new Scanner(System.in);
		System.out.println("Whats your phone number " + name + "?\n");
		int c = q.nextInt();
		System.out.println("Thanks");
		
		
	}
	}
	


