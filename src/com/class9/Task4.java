package com.class9;
import java.util.Scanner;
public class Task4 {

	public static void main(String[] args) {
		int secret=12;
		int guess;
		Scanner inpt=new Scanner(System.in);
	System.out.println("Guess a secret number from 1 to 20");
	guess=inpt.nextInt();
	while(guess!=secret) {
		if (guess>secret) {
			System.out.println("Your number is too large");
			
		}else if (guess<secret) {
			System.out.println("Your number is too low");
		}
		System.out.println("Please enter a new number: " );
		guess=inpt.nextInt();
		
	}System.out.println("Cograts buddy");
		
	}
	
	}


