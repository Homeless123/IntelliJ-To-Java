package day31_inheritance.animal_methodOverwriding;

public class Eagle extends Animal {

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void fly(){
        System.out.println("Eagle "+getName()+" is flying");
    }

    // Overriding eat method to specify Eagle's eating behavior
    @Override
    public void eat() {
        System.out.println("Eagle " + getName() + " is eating snake");
    }

    // Overriding drink method, but using the superclass's implementation
    @Override
    public void drink() {
        super.drink();
    }


}
