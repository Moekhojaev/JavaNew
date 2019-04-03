package com.studyonyourown;

import java.util.Scanner;

public class loopsPractice {

	public static void main(String[] args) {

		int i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;

		}
		System.out.println("-------NEW----------");

		int a = 2;
		do {

			System.out.println(a);
			a++;

		} while (a < 10);
		System.out.println("---------NEW-----------");
		/*
		 * 
		 */
		/* print only odd numbers from 1 to 20 */

		int b = 1;
		while (b < 20) {
			if (b % 2 == 1) {

				System.out.println(b);

			}
			b++;
		}

		System.out.println("----------NEW------------");

		int c = 1;
		do {
			if (c % 2 != 0) {
				System.out.println(c);
			}
			c++;
		} while (c < 100);
		System.out.println("----------NEW----------------");

		int num = 2;
		while (num < 100) {
			if (num % 2 == 0) {
				System.out.println(num);

			}
			num++;

		}
		System.out.println("---------------NEW--------------");

		int numb = 2;
		while (numb < 20) {
			System.out.println(numb);
			numb += 2;
		}
		/*
		 *  
		 */

		/*
		 * * Create a program that prompt user with question: Do you need a loan?If the
		 * result is true then prompt user with question: What is your credit score?
		 * Otherwise eligibility = "Unknown"Based on the score define users
		 * eligibilityif score is below 600 --> eligibility = "Not eligible"if score is
		 * between 600 and 700 inclusive --> eligibility = "Maybe eligible"if score is
		 * between 701 and 800 inclusive --> eligibility = "Eligible"if score is higher
		 * than any other previous values --> eligibility = "Definitely eligible" .The
		 * output of the program should be: "The eligibility is ____"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean result;
		int score;
		String eligibility = "";
		result = scan.nextBoolean();
		if (result) {
			System.out.println("What is your credit score?");
			score = scan.nextInt();
			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";
			} else if (score >= 701 && score <= 800) {
				eligibility = "Eligible";
			} else if (score > 800) {
				eligibility = "Definitely eligible";
			}
		} else {
			eligibility = "Uknown";
		}
		System.out.println("The eligibility is " + eligibility);
		/*
		 * * First Output: "enter name of the instructor"case 1: if User provided the
		 * name as Shiva as input it should show "Will take care of Java Assignment"case
		 * 2: if User provided the name as Sandish as input it should show
		 * "Will take care of SDLC Assignment"case 3: if User provided the name as Weqas
		 * as input it should show "Will take care of Selenium Assignment"case 4: if
		 * User provided the name as Asel as input it should show
		 * "Will take care of every Assignment"other than these four names if user
		 * provide the name try to give like (James or John )
		 * " Invalid instructor selected"
		 */
		String name = "";
		String inst;
		Scanner teacher = new Scanner(System.in);
		System.out.println("Please enter name of your Instructor");
		inst = teacher.nextLine();
		switch (inst) {
		case "Shiva ":
			name = "Will take care of Assignments";
			break;
		case "Sandish":
			name = "Will take care of SDLC Assignment";
			break;
		case "Weqas":
			name = "Will take care Selinum assignment";
			break;
		case "Asel":
			name = "Will take care of every assignment";
			break;
		default:
			name = "invalid instructor";

		}
		System.out.println(name);
		/* Prompt user to ask the name 3 times and print "You are doing great ____" */
		String names;
		Scanner u = new Scanner(System.in);
		int g = 1;
		while (g <= 3) {
			System.out.println("What's your name ??");
			names = u.nextLine();
			System.out.println("You are doing great" + names);
			g++;
		}
		/*
		 * create a boolean variable workDay and assign true* create int variable day
		 * and assign it to 1* as long as it is workDay print--> "I need a day off" and
		 * increment day* day once day is 6 --> your condition for your loop should
		 * become false
		 */

		boolean workDay=true;
		int variable=1;
		while(workDay) {
			if (variable==6) {
				System.out.println("I need a day of");
				
        workDay=false;
			}variable++;
		
			
		}
	}
}
