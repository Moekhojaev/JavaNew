package com.class22;

public class ParenChild2 extends Parent {

	public static void main(String[] args) {
		
		ParenChild2 object = new ParenChild2();
		System.out.println(object.eyeColor);
		System.out.println(object.nose);
		object.CanRun();
	}
	public void  CanRun() {
		System.out.println("Child can run fast");	
		}
}
