package com.class13;

import java.io.*;

public class StringManipulations {

	public static void main(String[] args) {

		String email = "moe@khoheav.com";
		String phone = "38388138";
		String password = "Moe123";
		if (!email.isEmpty()) {
			System.out.println("Email is available");
			if (!email.contains("@") && email.contains(".")) {
				System.out.println("But, email is not valid");
			} else {
				System.out.println("Email is valid");
				if (!phone.isEmpty()) {
					System.out.println("Phone is available");
					if (!password.startsWith("Moe")) {
						System.out.println("Password is wrong");
					} else {
						System.out.println("Password is right");
					}
				} else {
					System.out.println("Phone is not availble");
				}
			}
		} else {
			System.out.println("Please provide an email ");
		}

	}

}
