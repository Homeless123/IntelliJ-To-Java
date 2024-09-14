package day32_finalKeyword.carTask_Overwriting;

public class TestCarObject {
    public static void main(String[] args) {
        // Create instances of Car and subclasses
        Toyota toyota = new Toyota("Gtr4", "Blue", 1996, 126_000);
        Honda honda = new Honda("Civic", "Red", 2020, 21000);
        Audi audi = new Audi("A4", "Silver", 2023, 35000);
        BMW bmw = new BMW("X5", "Black", 2022, 55000);
        Tesla tesla = new Tesla("Model S", "White", 2024, 55000);

        // Test start method
        System.out.println("Toyota:");
        toyota.start();  // Output: Press the brake and twist the key to ignition

        System.out.println("Honda:");
        honda.start();   // Output: Press the brake and twist the key to ignition

        System.out.println("Audi:");
        audi.start();    // Output: Press the start button

        System.out.println("BMW:");
        bmw.start();     // Output: Call the mechanic or jump start

        System.out.println("Tesla:");
        tesla.start();   // Output: Say "Start"

        // Test autoPilot method
        tesla.autoPilot();  // Output: Engaging autopilot mode.

        // Display information

        System.out.println("\nToyota:");
        System.out.println(toyota);  // Output: Car [make=Toyota, model=Corolla, color=Blue, year=2021, price=22000.0, numberOfWheels=4, hasBattery=true]

        System.out.println("\nTesla:");
        //tesla.setModel("Model A");
        System.out.println(tesla);

    }
}
