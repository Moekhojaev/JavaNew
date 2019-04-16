package Class21;

public class LocalVariable {
	
	public static void main(String[] args) {
		
		String name= "John";
		
		
		LocalVariable obj=new LocalVariable();
		obj.hello(name);
		System.out.println(name);
	}
	

        public void hello(String name ) {
		name=" jack";
        	System.out.println("Hello"+name);
	}
}
