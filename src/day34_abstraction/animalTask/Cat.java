package day34_abstraction.animalTask;

public class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void play() {

    }

    @Override
    public void eat() {
        System.out.println(getClass()+" "+getName()+" is eating");
    }
}
