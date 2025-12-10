package n1exercici2;

public class Main {

	public static void main(String[] args) {

        //Crido al métode brake() sense crear cap instància
		System.out.println("Demostra com invocar el mètode estàtic");
        Car.brake();

        //Creo una instància i crido al métode accelerate()
		System.out.println("\nDemostra com invocar el mètode NO estàtic");
		Car cotxeDani = new Car(1100);
		cotxeDani.accelerate();
		
	}

}
