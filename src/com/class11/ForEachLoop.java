package com.class11;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] numbers= {12,13,14,15,16,17,18};
   for (int x:numbers) {
	   
	   System.out.print(x+" ");
   }
   
 /////////////////////////////////////////////////////////////////////
   
   
   
   String[] cars= {"Honda","Toyota","Maserati","Lamborghini","Ferrari", "Bugatti" };
   for(int i=0; i<cars.length-1; i++) {// 1st way 
	   
	 System.out.println(cars[i]);  
	   
   }
   
   for(String love:cars) {// 2nd way of doing 
	   System.out.println(love+" ");
	   
   }
	
 ///////////////////////////////////////////////////////////////////////  
   
   // Print countries with their capital using array
	
	String[] co= {"Tajikistan", "Uzbekistan", "US"};
	for(String  cs:co) {
		System.out.println(cs+":");
	
		if(cs.equals("Tajikistan")) {
		System.out.println("Dushanbe");
			
			
		}if(cs.contentEquals("Uzbekistan")) {
			
			System.out.println("Samarqand");
		}else if (cs.equals("US")) {
			
			System.out.println("Washingtond DC");
		}
	}
/////////////////////////////////////////////////////////////////////	
	
	
	
	
	
	int sum=0; //print total of array numbers 
	int [] calsum= {10,20,30};
	for(int i=0; i<=calsum.length-1; i++) {
		
		sum=sum+calsum[i];
			}System.out.println(sum);
    
			 
}

}