package Class21;

public class InstanceVar {
	protected String name = "John"; // instance variables can have access modifiers PUBLIC PROTECTED PRIVATE

	public static void main(String[] args) {

		String name = "Anna";
		System.out.println(name);
		System.out.println("======Changing Value of Local Variable=========");
		name = "Olga";
		System.out.println(name);
		
		//creating first object
		
		InstanceVar obj = new InstanceVar();
		System.out.println(obj.name);
		System.out.println("======Changing Value of Instance Variabe=========");
		obj.name="Jack";
	System.out.println(obj.name);	
	
	//creatuing second object
	InstanceVar obj1 = new InstanceVar();
	System.out.println(obj1.name);
	
	}
	public void Hello(String name) {
		System.out.println("Hello"+name);
	}
}
