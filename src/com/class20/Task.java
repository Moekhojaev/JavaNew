package com.class20;
public class Task {

	public static void main(String[] args) {
		/*String first, lastname, emailType;
		
		Scanner name = new Scanner (System.in);
		System.out.println("Please provide first last and email type to create an email");
		first=name.nextLine();
		lastname=name.nextLine();
		emailType=name.nextLine();
		
		Task fullemail= new Task();
		System.out.println(first+lastname+emailType);*/
		Task obj= new Task();
		String email = obj.createEmail("John", "Snow", "google");
		System.out.println(email.toLowerCase());
		email=obj.createEmail("Bob", "Snow", "outlook");
         System.out.println(email);
	}
// return type methodName
	String createEmail(String name, String lastName, String emailType) {
		String email= name+lastName+"@"+emailType+".com";
	return email.toLowerCase();

	}
	
}
