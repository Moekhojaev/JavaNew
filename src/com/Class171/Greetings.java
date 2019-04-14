package com.Class171;

public class Greetings {

	public static void main(String[] args) {
		
	Greetings obj = new Greetings();
	obj.hello();
	obj.findLargest(50,20);
	obj.Instructor("Moe", " Tuesday");
	
	}
	
	void hello() {
		System.out.println("Hello");
	}
	void Instructor(String name, String day) {
		System.out.println("The instructor "+ name +" will be teaching on " +day);
	}
	
	void findLargest(int a, int b) {
		// how to find the largest number
		
		
		if (a>b) {
			System.out.println("A is larger than B");
		}else {
			System.out.println("B is larger than A");
		}	
		
		
	}
}
