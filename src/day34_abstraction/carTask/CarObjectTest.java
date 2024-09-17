package day34_abstraction.carTask;

public class CarObjectTest {
    public static void main(String[] args) {
        System.out.println();

        Tesla tesla = new Tesla( "Model S", "Red", 2021, 80000.0);
        Honda honda = new Honda("Civic", "Blue", 2020, 60000.0);
        Audi audi = new Audi("A4", "Black", 2019, 70000.0);

        System.out.println(tesla);
        tesla.start();
        tesla.autoPilot(); // Output: Tesla Model S is in self-driving mode
        tesla.stop(); // Output: Tesla Model S stopped
        System.out.println("===========");
        System.out.println(honda);
        honda.start();
        honda.stop(); // Output: Honda Civic stopped
        System.out.println("===========");
        System.out.println(audi);
        audi.start();
        audi.autoPark(); // Output: Audi can't be parked automatically.'
        audi.stop(); // Output: Audi A4 stopped


    }
}
