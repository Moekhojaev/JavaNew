package com.class22;

public class refer {
	
		  class A {
		    int i=10;
		  } 
		  
		  class B  extends A{
		    int i=20;
		  }
		  
		  public  static void main(String[] args) {
		    B obj= new B();
		    System.out.println(obj.i);
		    
		      
		  }
		
		}

