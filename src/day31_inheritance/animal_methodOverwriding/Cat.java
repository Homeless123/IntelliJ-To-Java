package day31_inheritance.animal_methodOverwriding;

public class Cat extends Animal {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food");
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        System.out.println("Cat "+getName()+" is sleeping 12 hours in a day");
    }
    public void Scratch(){
        System.out.println("Cat "+getName()+" scratching");
    }
}
