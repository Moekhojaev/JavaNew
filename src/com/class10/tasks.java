package com.class10;

public class tasks {
public static void main(String[] args) {
	
	char[] letters= {'A', 'B', 'C', 'D', 'E', 'F'};//Way1
	System.out.println(letters[1]);
	
	char[] letter=new char [6];//Way 2
	letter[0]='A';
	letter[1]='B';
	letter[2]='C';
	letter[3]='D';
	letter[4]='E';
	letter[5]='D';
	System.out.println(letter[1]);
	
	//////////////////////////////////////////
	 
	String [] names= {"Ali", "Muhammad"}; //Way1
	System.out.println(names[1]);
	
	
	String[] name= new String[2];// Way2
	name[0]="Ali";
	name[1]=" Muhammad";
	System.out.println(name.length + name[1]);
	 
	String[] s= {"Saturday ", " Is " , " Java " , " Coding " , " Day "};
	System.out.println(s[0]+s[1]+s[2]+s[3]+s[4]);
}

}
