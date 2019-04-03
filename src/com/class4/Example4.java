package com.class4;

import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args) {
		
		int work, salary;
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter how many years you worked");
		
		work=input.nextInt();
		
		System.out.println("What's your salary");
		
		salary=input.nextInt();
		
		if (work>=5) {
			
			System.out.println("Eligible for bonus");
			
			if (salary>50000) {
				
				System.out.println("Your bonus is 5000");
			}else {
				
				System.out.println("Bonus is 3000");
			}
		}else  {
			
			System.out.println("Not Elibilge for bonus");
			
		}
			
		
		
	}

}
