package com.Class151;

public class IQ2 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array? Maximum
		 * and minimum number in the array?
		 */
		int[] array = { 10, 20, 40, 69, 90 };
		int min= array[0];
		int max=array[0];
		int second=array[0];
		for (int i=0; i<array.length; i++) {
		if (array[i]>max) {
			max=array[i];
		}if (array[i]<min) {
			min=array[i];
			}
		}
		for (int a:array) {
			if (a>second && a<max )
				second=a;
		}	
		System.out.println("The largest num in the array is "+ max);
		System.out.println("The min nuber in the array is "+ min);
		System.out.println("The second largest number in the array is "+ second);
		

	}
}
