package day25_constructors;

public class Rectangle {

    public double length, width;

// this one is more effective
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // up and down its same
/*
    public void setInfo(double length, double width) {
        this.length=length;
        this.width=width;
    }
*/
    public double area (){
        return length * width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
}
