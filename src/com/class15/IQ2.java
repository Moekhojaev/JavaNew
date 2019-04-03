package com.class15;

public class IQ2 {
	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
		 */  
	        int array[] = { 10, 20,30,60,90,100};
	        int min = array[0];
	        int secondLargest = array[0];
	        int largest = array[0]; 
	        
	        for (int q:array) {
	        if (q>largest) {
	        	largest=q;
	        	
	        } if (q<min) {
	        	min=q;
	        }
		} for (int q : array) {
			if (q>secondLargest && q<largest){
			secondLargest=q;	
			}
		}
		System.out.println("min "+ min) ;
		System.out.println("largest " +largest);
		System.out.println("secondLargest " + secondLargest);
	
	}

}
