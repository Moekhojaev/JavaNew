package com.class22;

public class ParenChild1 extends Parent {

	
//extends to inhertit 
	String hairType = "curly";
	public static void main(String[] args) {
	    ParenChild1 obj = new  ParenChild1();
	   System.out.println("Child one eye color is "+ obj.eyeColor);
	    System.out.println("Child one hair color is "+ obj.hairColor);
	   System.out.println("Child one nose is "+ obj.nose);
	    obj.sing();
	    
	    Parent  pObj= new Parent();
	//    pObj.hairType --> not accessible in Parent Class
		
	}
	public void playTennis() {
		System.out.println("Child One Can play");
	}
}
