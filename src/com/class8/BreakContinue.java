package com.class8;

public class BreakContinue {

	public static void main(String[] args) {
		for (int i=0; i<=10; i++) {
			
			if (i==2 || i==5) {
			
				continue;
				
			}
			System.out.println(i);
			
		} // I want to print number from 1 to 20 but skip the ones that are devisible by 3
		
		for (int a =1; a<=20; a++) {
			
			if (a%3==0) {
				continue;
			}
			System.out.println(a);
			
		}

	}

}
