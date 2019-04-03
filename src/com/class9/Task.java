package com.class9;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		int start, finish, a=0,  b=0 ;
		Scanner inpt= new Scanner(System.in); 
		System.out.println("Enter start number and end number ");
		start=inpt.nextInt();
		finish =inpt.nextInt();
		for (int c= start; c<= finish ; c++ ) {
			if (c%2==0) {
				a+=c;
			}else {
				b+=	c;
				}
				}
				
			}
	
	
			
		}
		
		
		
	


//Write a program that reads a range of integers (start and end point), 
//provided by a user and then from that range prints the sum of the even and odd integers.