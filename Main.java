package n1exercici2;

public class Main {

	public static void main(String[] args) {

        //Call the break() method without creating any instance because it is a static method.
		System.out.println("Demonstrate how to invoke the static method.");
        Car.brake();

        //Create an instance and call the accelerate() method.
		System.out.println("\nDemonstrate how to invoke the NON static method.");
		Car cotxeDani = new Car(1100);
		cotxeDani.accelerate();
		
	}

}
