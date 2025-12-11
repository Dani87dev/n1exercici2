package n1exercici2;

public class Car {

	//Attributes
	private static final String BRAND = "Dacia";
	private static String model = "Sandero";
	private final int POWER;
	
	//Constructor
	public Car(int power ) {
		this.POWER = power;
	}

	//Getters && Setters
	public static String getModel() {
		return model;
	}
	public int getPOWER() {
		return POWER;
	}
	public static String getBrand() {
		return BRAND;
	}
	public static void setModel(String model) {
		Car.model = model;
	}

	//Methods
	public static void brake() {
		System.out.println("The vehicle is breaking down");
	}
	public  void accelerate() {
		System.out.println("The vehicle is accelerating");
	}

}
