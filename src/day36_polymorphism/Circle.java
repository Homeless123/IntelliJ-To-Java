package day36_polymorphism;

public  class Circle {

    private double radius;
    private final static double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return PI * radius * radius;
    }
    public double perimeter(){
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if ( !( obj instanceof Circle ) ){// if the specified object is not circle, then we Should not compare them
            System.err.println("Invalid object type.");
            System.exit(1);
        }
        if (radius == ( (Circle)obj).radius ){ // if the current circle' radius is equal to the given circle's radius, then two circles are equal
            return true;
        }

        return false;
    }
    // == not use this method because it's overriding equals method in Object class
    // .equals(Object o) {}

}
