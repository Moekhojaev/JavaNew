package com.javaPractice;

public class Array2ndLargest {

	public static void main(String[] args) {
		int array[] = {12,20,30,50,100, -1};
		int min = array[0];
		int largest = array[0];
		int Secondlargest=array[0]; 
		
		for (int i:array) {
			if ( i>largest) {
				largest=i ;
			}if (i<min) {
				min=i;
			}
		}for (int i:array) {
				if (i>Secondlargest && i<largest) {
					
					Secondlargest=i;
				}
			}
			
		
			
		System.out.printf("Largest number in array is %d, seconLargest is %d and the min is %d",largest,Secondlargest,min);
	}
		
	}

