package day26_statics;

public class IPhone {
    public static String brand = "Apple";  // static: "Apple" is the brand of all iPhone objects
    public static String OS = "iOS";       // static: All iPhones use the iOS operating system
    public static String madeIn = "China"; // static: All iPhones are made in China
    public static boolean hasBattery = true; // static: All iPhones have batteries
    public static boolean isTouchScreen = true; // static: All iPhones have touch screens
    public static boolean isExpensiveToFix = true; // static: iPhones are generally expensive to repair

    public String model;   // instance: different models (e.g., iPhone 13, iPhone 12)
    public String color;   // instance: different colors (e.g., Black, White, Blue)
    public double price;   // instance: varies based on model or configuration
/*
    public static void printPhoneInfo(){ instance variable not be static , static only accept static
        System.out.println("model: "+model);
        System.out.println("color: "+color);
*/
    public void printPhoneInfo(){ // intance method accept both static and none static or static variable
        System.out.println("brand = " + brand);// this is static
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
    }

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public static void printOperatingSystem(){
        System.out.println("Operating System : "+OS);
    }


}

/*
Attributes:
    brand, model, color, price, OS, madeIn, hasBattery, isTouchScreen, isExpensiveToFix
 */
