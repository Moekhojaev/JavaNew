package com.class22;

public class StaticVsNonStatic {
	public String name = "John"; //instance var
	// instance variable can be accessed only thru the object
	public static String lastName="Snow"; //static variable
	
     	public static void main(String[] args) {

     		StaticVsNonStatic obj= new StaticVsNonStatic();
     		
     		obj.getInfo();
     		getInfo1(); // Because theres static method and it belongs to ONE class we don't need any obj.
     		System.out.println(lastName);
     		
     		
     	} 
     	// method getInfo is non static- can access both instance and static varibale
     	public void getInfo() {
		System.out.println("My name is "+ name+ " and my last name is "+ lastName);
		
		getInfo1();// we can access static method within non static 
		
	}
//Static method cant have an access only to static variables
     	public static void getInfo1() {
     	//	System.out.println("My name is "+ name+ "and my last name is "+ lastName);
     		//will get an error
     	System.out.println("I am a static method ");
     	// we can't access non static method within static 
     	}
     	
     	
}
