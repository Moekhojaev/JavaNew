package com.class5;

public class Example2 {
public static void main(String[] args) {
	int quiz = 90;
	int midTerm =90;
	int finalScore=92;
	
	int avarageScore= ((quiz+midTerm+finalScore)/3);
	
	if (avarageScore>=90) {
	System.out.println("You are an A Student");
	}else if (avarageScore>=70 && avarageScore<90) {
		System.out.println("You are a B Student");
		
	}else if (avarageScore>=50 && avarageScore<70) {
		System.out.println("You are a C Student");
	
	}else if (avarageScore<50) {
		System.out.println("You are a  F Student");
	}
}
}
