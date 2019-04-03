package com.studyonyourown;

import java.util.Scanner;

public class ScannerMore {
	
	public static void main(String[] args) {
		
		String state;
		int temp;
		
		Scanner srt=new Scanner(System.in);
		System.out.println("What State are you from?");
		
		String nek=srt.nextLine();
		
		System.out.println("Whats the temp in there " );
		temp=srt.nextInt();
		int convertedTemp= (temp-32)*5/9;
		
		System.out.println("The temperature in the city of "+nek+" is "+convertedTemp);
			
		
		
		
		
	}

}
