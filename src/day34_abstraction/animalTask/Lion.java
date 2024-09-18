package day34_abstraction.animalTask;

public class Lion extends Animal implements WildAnimal {//Lion is a subclass of AnimalTask{

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {

    }

    @Override
    public void eat() {
        System.out.println("Lion "+getName()+" is eating meat");
    }
}
