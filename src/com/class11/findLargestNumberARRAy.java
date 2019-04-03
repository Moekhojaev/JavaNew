package com.class11;

public class findLargestNumberARRAy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] num= {10,11,20};
	int max=0;
	for (int i:num) {
		
		if (i>max) {
			
			max=i;
		}
		
	}
	System.out.println("Largest number is " + max);
	////////////////////////////////////////////////////
	//find the largest numbers
	int[] numbers= {200, -20,13,499,650000};
	int largest=numbers[4];
	for(int i=0; i<numbers.length; i++) {
		
		if(numbers[i]>largest) {
		
			largest=numbers[i];
			
		}
		
	}
	System.out.println("The largest number is "+largest);
	
	}
	
		
	}
