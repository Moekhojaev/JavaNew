package Class14;
import java.util.Scanner;
public class Review {
 public static void main(String[] args) {
	/*System.out.println("What's yout moms name ");
     Scanner inpt= new Scanner (System.in);
     String momName=inpt.nextLine();
     System.out.println("What's your dads name");
     String dadName=inpt.nextLine();
     System.out.println("What's the gender");
     String gender= inpt.nextLine();
     if (gender.equalsIgnoreCase("Boy")) {
    	 System.out.println(momName.substring(0, momName.length()/2)+dadName.substring(dadName.length()/2, dadName.length()));
     }else if (gender.equalsIgnoreCase("Girl")){
    	 System.out.println(momName.substring(momName.length()/2, momName.length())+ dadName.substring(0, dadName.length()/2));
     } */
     
     System.out.println("-------------------Replace and ReplaceAll-----------------------------");
	/*
	 *  Replace & ReplaceAll
	 */
     
     String str= "Good morning";
     String a = str.replace("o", "a");
     System.out.println(a);
     
     String str1= " Good morning 581323785783185^^w636";
     System.out.println(str1.replaceAll("[0-9]"," "));
     System.out.println(str1.replaceAll("[^A-Za-z]", " "));
     System.out.println("-------------------ToCharArray-----------------------------");
     
  // toCharArray   
 	String str5= "Monday";
      char [] array = str5.toCharArray();
      for (int i=0; i<array.length; i++) {
	   System.out.print(array[i]);

      }System.out.println();
      for (char abc:array) {
    	  System.out.print(abc);
      }
    	  System.out.println("-------------------Reverse-----------------------------");
    	     
    	  // Reverse a string 
    	  
    	String str6= "Tuesday"; 
    	char[] arrays= str6.toCharArray();
    	String reverse=" ";
    	for (int b=arrays.length-1; b>=0; b--) {
    		reverse+=arrays[b];
    	}
    	System.out.println(reverse);
    	
    	//Split 
    	String str7= "Good morning everyone";
    	String [] spt= str7.split(" ");
    	for (int p=0; p<spt.length; p++) {
    		System.out.println(spt.length);
    		
    		System.out.print(spt[p]);
    	}
      
 }
}
