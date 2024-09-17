package day34_abstraction.animalTask;

public class Duck extends Animal implements  Playable , Flyable ,Swimable{
    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void play() {
    }

    @Override
    public void eat() {
        System.out.println(getClass()+ " "+ getName()+" is eating duck food.");
    }
}
