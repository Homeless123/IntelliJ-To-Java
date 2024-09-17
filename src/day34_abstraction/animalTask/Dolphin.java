package day34_abstraction.animalTask;

public class Dolphin extends Animal implements Playable , Swimable{
    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void swim() {

    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {
        System.out.println(getClass()+" "+ getName()+" is eating krill");
    }
}
