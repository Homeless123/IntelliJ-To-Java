package day36_polymorphism;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(15);
        System.out.println( circle1 == circle2 ); // false
        System.out.println(circle1.equals(circle2)); // true
        System.out.println(circle1.equals(circle3)); // false
        // System.out.println(circle1.equals("Java"));//Invalid object type.
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        IPhone iphone1 = new IPhone("Iphone ", "IPhone12", "Medium", "Blue", 900);
        IPhone iphone2 = new IPhone("Iphone ", "IPhone12", "Medium", "White", 900);
        System.out.println(iphone1.equals(iphone2)); // false (different brand, model, color, price)
                                                    // true bc of everything else is same



    }


}
