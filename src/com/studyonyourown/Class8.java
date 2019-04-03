package com.studyonyourown;
import java.util.Scanner;
public class Class8 {

	public static void main(String[] args) {
		for (int a = 1; a <= 100; a++) {

			System.out.println(a);
		}
		for (int b = 100; b >= 1; b--) {
			System.out.println(b);
		}
		for (int c = 1; c <= 20; c++) {
			if (c % 2 != 0) {
				System.out.println(c);
			}
		}
		for (int d = 1; d <= 20; d += 2) {
			System.out.println(d);
		}
		for (int e = 1; e <= 20; e++) {
			if (e % 2 == 0) {
				System.out.println(e);

			}
		}

		for (int f = 0; f < 10; f++) {
			if (f == 4) {
				continue;
			}
			System.out.println(f);
		}
		for (int f = 0; f < 10; f++) {
			if (f == 4) {
				break;
			}
			System.out.println(f);
		}
		for (int g = 0; g < 10; g++) {
			System.out.println("Hello");
			break;

		}
		/* * prompt user to enter 2 integers and compare At the end print largest */
		int num1,num2;
		int largest=0;
		Scanner ms=new Scanner(System.in);
		for (int i=1; i<3; i++) {
			System.out.println("Please enter to intigers");
			num1=ms.nextInt();
			num2=ms.nextInt();
			if (num1>num2) {
				largest=num1;
			}else if (num2>num1) {
				largest=num2;
			}
				
			
		}System.out.println("You entered two numbers largest is "+largest);
	}

}
