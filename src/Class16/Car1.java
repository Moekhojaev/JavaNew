package Class16;

public class Car1 {
	
	String make, model, color;
	int door, wheels; 
	
	public static void main(String[] args) {
		
		Car1 car = new Car1();
		car.make="Honda";
		car.model="Civic";
		car.color="Black";
		car.door=4;
		car.wheels=4;
		System.out.println("Car is " +car.make);
		car.reverse();
	}
	
	void reverse() {
		System.out.println("Car can reverse");
	}

	
}
