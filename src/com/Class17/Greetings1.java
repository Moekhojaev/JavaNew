package com.Class17;

public class Greetings1 {
	public static void main(String[] args) {
		
		Greetings1 obj =new Greetings1();
		obj.findLargest(10, 20);
		obj.helloToInstructor("Moe");
		
		
	
	}
	void findLargest(int a, int b) {
		if (a>b) {
			System.out.println(a+"is the largest number");
		}else {
			System.out.println(b+"is the largest number");
		}	
	}void helloToInstructor(String name){
		System.out.println("Hello "+ name );
	}

}
