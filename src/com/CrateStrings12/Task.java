package com.CrateStrings12;
import java.util.Scanner;
public class Task {

	public static void main(String[] args) {
		String conpass;
		System.out.println("Input username and password");
		Scanner inpt= new Scanner(System.in);
		String username= inpt.nextLine();
		String password= inpt.nextLine();
		
		if(!(username.isEmpty() && password.isEmpty())) {
			if (!(password.length()<=8)) {
				if(password.contains(username)) {
					System.out.println("Password can't contain username");
				}else {
					System.out.println("Please print password once again");
				conpass=inpt.nextLine();
				if(conpass.equals(password)) {
					System.out.println("Your username and password has been crerated");
				}else {
				System.out.println("Password dosen't match");
					
				}
				}
			}else {
			System.out.println("Password is too short");	
			}
		}else {
			System.out.println("Userame and Password cant be empty");
		} 
		
		

	}

}
