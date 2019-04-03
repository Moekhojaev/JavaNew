package com.class6;

import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {

		Scanner scan;

		String country, favoriteFood;

		scan = new Scanner(System.in);
		System.out.println("Where are you from ?");
		country = scan.nextLine();
		switch (country) {
		case "USA":
			favoriteFood = "Burger";
			break;
		case "Tjk":
			favoriteFood = "Pilav";
			break;
		case "UZBK":
			favoriteFood = "KSlafa";
			break;

		default:
			favoriteFood = "Unknown";

		}
		
		System.out.println("Your favorite food is " + favoriteFood);
	}

}
