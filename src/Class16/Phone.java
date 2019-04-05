package Class16;

public class Phone {
	boolean model;
	String brand;
	int year;
	double price;

	public static void main(String[] args) {
		/*
		 * Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia with
		 * specific attributes and behaviours.
		 */
		Phone Iphone = new Phone();
		Iphone.model = true;
		Iphone.year = 2019;
		Iphone.price = 999.99;
		Iphone.brand = "Apple";
		Iphone.useSlack();
		Iphone.watchMovie();
		Iphone.useAmazon();
		Phone Samsung = new Phone();
		Samsung.model = true;
		Samsung.year = 2018;
		Samsung.price = 899.99;
		Samsung.brand = "Android";
		Samsung.useSlack();
		Samsung.watchMovie();
		Samsung.useAmazon();
		Phone Nokia = new Phone();
		Nokia.model = true;
		Nokia.year = 2017;
		Nokia.price = 799.99;
		Nokia.brand = "NK";
		Nokia.useSlack();
		Nokia.watchMovie();
		Nokia.useAmazon();

	}

	void useSlack() {
		System.out.println("Use slack on my " + brand);

	}

	void watchMovie() {
		System.out.println("Watch a movie on my " + brand);
	}

	void useAmazon() {
		System.out.println("Use amazon on my " + brand);
	}
}
