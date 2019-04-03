package com.studyonyourown;
import java.util.Scanner;
public class Class10Tasks {

	public static void main(String[] args) {
		/*
		 * * Write a program that reads a range of integers (start and end point), *
		 * provided by a user and then from that range prints the sum of the even and *
		 * odd integers.
		 */
		//COMEBACK
	   Scanner scan;	
	   int Start=0;
	   int End=0;
	  
	   int sumEven=0, sumODD=0, range=0;
	   
	   scan=new Scanner(System.in);
	   System.out.println("Please enter two intigers to find sum of even and ODD numbers");
	   Start=scan.nextInt();
	   End=scan.nextInt();
	   for (int i=Start; i<End; i++) {
		   System.out.println(i);
		   if (Start<End) {
			   if(i%2==0) 
			   
			  sumEven+=i;
			   }else if (i%2!=0) {
				   
					  sumODD+=i;}
				   
			   
		   
		   else if (Start>End) {
			   if(i%2==0) 
				   
					  sumEven+=i;
					   }else if (i%2!=0) {
						   
							  sumODD+=i;}
			   }
	  
		   System.out.println(sumEven);
		   System.out.println(sumODD);

	   
	}

}
