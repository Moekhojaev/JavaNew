package com.class6;

import java.util.Scanner;

public class HW2 {
public static void main(String[] args) {
	
	Scanner scan;
	String grade, explain;
 
	
	scan=new Scanner(System.in);
	System.out.println("What is your grade?");
	grade=scan.nextLine();
	
	switch(grade) {
	case "A":
		explain="Excellent";
		break;
		
	case "B":
		explain="Good";
		break;
	case "C":
		explain="Average";
		break;
	case "D":
		explain= "Bad";
		break;
		
	default:
		explain="Unkonwn";
	
	
	
	}
	System.out.println("You are "+ grade+" Student which is "+explain);
}

}
