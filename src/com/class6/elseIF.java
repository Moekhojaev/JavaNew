package com.class6;

import java.util.Scanner;

public class elseIF {
	public static void main(String[] args) {
		
		Scanner scan; 
		boolean snowing, raining,sunny;
		String activity; 
		int temp;
		
		scan =new Scanner(System.in);
		System.out.println("Please entert temp");
	    temp=scan.nextInt();
		
	    if (temp>=40 && temp<80){
			System.out.println("Is it raining");
			raining=scan.nextBoolean();
			if (raining) {
				
				System.out.println("I will go hiking");
			}else {
				System.out.println("I will not go hiking");
			}
	    } if (temp>=25 && temp<40){
			System.out.println("Is it snowin");
			snowing=scan.nextBoolean();
			if (snowing) {
				
				System.out.println("I will go snowboarding");
			}else {
				System.out.println("I will not go snowboarding");
			}if (temp>80) {
				System.out.println("Is it sunny");
				sunny=scan.nextBoolean();
				if (sunny) {
					System.out.println("I will go to the beach");
				}else {
					System.out.println("I am not going to the beach");
				}
			}
			
	    }
		
		
	}

}
