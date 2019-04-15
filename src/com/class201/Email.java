package com.class201;

public class Email {

	String address(String name, String lastname, String emailType ) {
	 String email=name+lastname+emailType;
	return email.toLowerCase();
	}
	

	public static void main(String[] args) {
		Email obj= new Email();
		String email= obj.address("Muhammad", "Khojaev","@gmail.com");
	System.out.println(email);
	
	}
}
