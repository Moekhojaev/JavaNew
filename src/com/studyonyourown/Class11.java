package com.studyonyourown;

public class Class11 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int a : numbers) {
			System.out.println(a);
		}
		String[] abc = { "Moe", "Sheyh", "Toly", "Inna", "Alaiksei" };
		for (String def : abc) {
			System.out.print(def + " ");
		}
		System.out.println();

		// PRINT CAPITALS OF EACH COUNTRY
		String[] countries = { "US", "Arizona", "TJK", "UZB" };
		for (String capitals : countries) {
			switch (capitals) {
			case "US":
				System.out.println(countries[0] + " Washington DC");
				break;
			case "Arizona":
				System.out.println(countries[1] + " Phoenix");
				break;
			case "TJK":
				System.out.println(countries[2] + " DUSHANBE");
				break;
			case "UZB":
				System.out.println(countries[3] + " Samarqand");
				break;
			default:
				System.out.println("Don't know");
				break;
			}};
			/*
			 * Create an array on integers and calculate 
			 * the sum of all elements in an array. 
			 */
            int [] num = {100,200,300,400,500};
			int sum=0;
            for ( int a:num) {
               sum+=a;
            }System.out.println(sum);
 
            /*
             *  Find the largest number in array 
             */
            int array[]= { 10,20,30,89};
            int largest= array[0];
		    for (int i=0; i<array.length; i++) {
		    	if (array[i]>largest) {
		    	largest=array[i];
		    	}
		    }
		    System.out.println("largest number is "+ largest);
			
	}
}
