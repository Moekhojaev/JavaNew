package com.Class21;

public class dog {
	static String breed = " Husky ";
	static int paws = 4;

	String name;
	int height;
	int weight;

	public static void main(String[] args) {
		dog dog1 = new dog();
		dog dog2 = new dog();
		dog dog3 = new dog();
		//1sr dog
    dog1.name="Mardy";
    dog1.height=60;
    dog1.weight=40;
    dog1.getDogProprty();
    
    //2 dog 
    dog2.name="Waflle";
    dog2.height=100;
    dog2.weight=90;
    dog2.getDogProprty();
    //3rd dog
    breed=" Pug";
    dog3.name="Lucy";
    dog3.height=20;
    dog3.weight=30;
    dog3.getDogProprty();
    dog1.getDogProprty();
    dog2.getDogProprty();
    System.out.println(breed);
  //3 Ways accessing static varibales
 //   System.out.println(breed);
 //   System.out.println(dog.breed);// Use class name 
 //   System.out.println(dog1.breed); // by object reference- not prefered
	}
	public void getDogProprty() {
System.out.println(name+" is a breed of"+breed+" and wight is "
	+ weight+" and heght is "+height);
	}
}
