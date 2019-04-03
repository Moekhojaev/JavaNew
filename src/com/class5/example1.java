package com.class5;

import java.util.Scanner;

public class example1 {
	public static void main(String[] args) {
		int height;
		Scanner enterHeight= new Scanner(System.in);
		System.out.println("Enter Height");
		height= enterHeight.nextInt();
		if (height>=0 && height<=5) {
			
			System.out.println("You are short");
			
		}else if (height>5 && height<6) {
			
		}else if (height>6) {
			
			System.out.println("You are tall");
		}
	}

}
