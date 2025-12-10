package n1exercici2;

public class Car {

	//Atributs
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
	
	
	//Métodes
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public  void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
}
