package day26_statics;

public class TestIPhoneObject {
    public static void main(String[] args) {
        // Create an instance of IPhone
        IPhone blackBerry = new IPhone("blackBerry 12", "Black", 1050);

        // Access and print instance variables
        System.out.println("Instance variables:");
        System.out.println("Color: " + blackBerry.color);
        System.out.println("Price: " + blackBerry.price);
        System.out.println("Model: " + blackBerry.model);

        // Use the instance method to print instance variables
        System.out.println("\nUsing instance method:");
        blackBerry.printPhoneInfo();

        // Access and print static variables (using object, though not ideal)
        System.out.println("\nStatic variables (accessed through instance, not recommended):");
        System.out.println("Brand: " + blackBerry.brand);
        System.out.println("Operating System: " + blackBerry.OS);

        // Call static method using the instance (though it's better to call it via the class)
        System.out.println("\nCalling static method using instance:");
        blackBerry.printOperatingSystem();

        // Access and print static variables (better way using class name)
        System.out.println("\nStatic variables (accessed through class):");
        System.out.println("Brand: " + IPhone.brand);
        System.out.println("Operating System: " + IPhone.OS);

        // Call static method using the class
        System.out.println("\nCalling static method using class:");
        IPhone.printOperatingSystem();
    }
}
