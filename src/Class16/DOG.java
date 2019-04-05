package Class16;

public class DOG {
String color;
int age; 
public static void main(String[] args) {
	/*
	 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador with specific attributes and behaviours.
	 */
	
	DOG Husky = new DOG();
    Husky.color= "black";
    Husky.age= 10;
    Husky.myDogColor();
    DOG Bulldog = new DOG();
    Bulldog.color= "blue"; 
    Bulldog.age= 10;
    
    
    DOG Labrador = new DOG();
    Labrador.color= "white";
    Labrador.age= 10;
    





}
void myDogColor  () {
	System.out.println("My dog color is "+ color);
}

}
	
