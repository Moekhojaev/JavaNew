package com.class22;

public class Car {
	public static String type= "Toyota";
	String color, model; //declaring instance variable
	int doors;
	boolean engine;
	
  Car(){// Constructor simmilar to method 
        	System.out.println("I am A COnstructor");
    	System.out.println("Hello from constructor");
    	//Counstructor gets executed only when you create an obje
  
     }
	public static void main(String[] args) {
	Car obj = new Car();
	System.out.println(obj.color); //null -String 
	System.out.println(obj.model);//null -String 
	System.out.println(obj.engine); //false - boolean
	System.out.println( obj.doors); //  0 - intiger
	hello();
		
	
		
	}public static void hello() {
	//before using local veriable you have to initialize it 
		String name;
//	System.out.println(name); Comipiler will give you an error 
		System.out.println("I am a static hello method");
	}
	

}
