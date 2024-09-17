package day34_abstraction.animalTask;

public class Shark extends Animal  implements WildAnimal , Swimable{
    public Shark(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void eat() {
        System.out.println(getClass()+" "+ getName()+" is eating fish.");
    }
}
