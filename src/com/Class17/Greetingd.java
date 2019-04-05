package com.Class17;

public class Greetingd {
//main method makes our code executble
	
	
	
	public static void main(String[] args) {
		Greetingd obj = new Greetingd();
		obj.hello();
	    obj.findLargest(11,10);	// checks the findTheLargest
	    obj.findLargest(31,302);	
	   obj.helloToInsrt("Waqas");
	   obj.helloToInsrt("Aseljan");
		
		
		
	}

	void hello () {// method signature 
		System.out.println("Hello"); //method body
	}
	void helloToInsrt(String name /*method with parameter*/) {
		System.out.println("Hello "+name);
	}
	void findLargest(int a, int b /*method with parameter*/) {
	
		if (a>b) {
			System.out.println("A is larger the B");
		}else {
			System.out.println("B is larger than A");
		}
		
	}
}
