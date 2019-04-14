package com.Class171;

public class Palindrome {

	void Pal (String name) {
		String reverse= "";
		for (int i=name.length()-1; i>=0; i-- ) {
			reverse+=name.charAt(i);
		}
		if (reverse.equalsIgnoreCase(name)) {
			System.out.println("It is palindrome ");
		} else{
			System.out.println("It's isnt a palindrome");
		}
	}
	public static void main(String[] args) {
		Palindrome obj= new Palindrome();
		obj.Pal("Ala");
	}

}
