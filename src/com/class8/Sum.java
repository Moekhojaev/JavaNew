package com.class8;

public class Sum {
  public static void main(String[] args) {
//	  int sum=0;
//	  for (int i=1; i<=5; i++) {
//		  
//		  sum=sum+i;
//	  }
//	 System.out.println(sum); 
//	  
	  
	  int sum=0; 
	  for (int i=1; i<=100; i+=2 ) {
		  
		  
		  sum=sum+i;
	  }
	 System.out.println(sum);
	 
	
	 
	 
	 int sum1=0;
	 for (int i=1; i<=100; i++ ) {
		if (i%2==0) {  
		  
		  sum1=sum1+i;
      
		  System.out.println(sum1);
		  }
 	  }
		
}
}
