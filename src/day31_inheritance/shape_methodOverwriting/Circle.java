package day31_inheritance.shape_methodOverwriting;

public class Circle extends Shape {
    public Circle(double radius) {
        setRadius(radius);
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn");

        System.out.println("   **   ");
        System.out.println("  ****  ");
        System.out.println(" ****** ");
        System.out.println("********");
        System.out.println(" ****** ");
        System.out.println("  ****  ");
        System.out.println("   **   ");
    }
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", radius='" + getRadius() + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}