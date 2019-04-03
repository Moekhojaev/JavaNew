package Class16;

public class Car {

	String make, model,color;
	int door,wheels;
	
	public static void main(String[] args) {
	
		//ClassName, variableName=new Classname();
		
		Car car1 = new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
System.out.println("Car "+car1.make);
		//defined behavior
car1.drive();
car1.reverse();
car1.stop();
//2 object
		Car car2 = new Car();
		car2.make= "Tesla";
		car2.model="x";
		car2.color= "black";
		car2.door=4;
		car2.wheels=5;		
		System.out.println("Car "+car2.make);
		//
		
		
	}
	void drive() { // Start with lover case
		System.out.println("Car can drive");
	}
	void reverse() {
		System.out.println("Car can reverse");
	}
	void stop() {
		System.out.println("Car can stop");
	}
}
