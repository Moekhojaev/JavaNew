package Class161;

public class Car {
String make, model, color;
int door, wheels; 
public static void main(String[] args) {
	//ClassName variableName=new Classname();
	Car car1=new Car();
	car1.make="Honda"; 
	car1.model="Civic";
	car1.color="Black";
	car1.door=4;
	car1.wheels=5;
  
System.out.println("Car is "+ car1.make+ "  adn has "+car1.door+" door");
	//define behaviour
car1.honk();
car1.drive();
car1.reverse();

System.out.println("-----Second OBJECT==============");

//2object

	Car car2= new Car(); 
	car2.make="Tesla";
	car2.model="Model x";
	car2.color = "Blue";
	car2.door= 4;
	car2.wheels=4;
	car2.honk();
	car2.reverse();
	car2.drive();
}
void drive() {
	
	System.out.println("car can drive");
}
void reverse() {
	System.out.println("car can reverse");
}void honk (){
	System.out.println("Car can honk");
}

}
