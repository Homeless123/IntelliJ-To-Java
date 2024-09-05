package day26_statics;

public class TestCarObject {
    public static void main(String[] args) {
        Car car1=new Car("BMW");
        System.out.println(car1);
        Car car2=new Car("Audi","Q7");
        System.out.println(car2);
        Car car3=new Car("Ford","Focus",2019);
        System.out.println(car3);
        Car car4=new Car("Toyota","GTR",1998,120_000);
        System.out.println(car4);
        Car car5=new Car("Lexus","Lfa",2019,40_000,"White");
        System.out.println(car5);


    }
}
