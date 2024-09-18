package day35_polymorphism.animalTask;

public abstract class AnimalTask {
    private String name;
    private String breed;
    private int age;
    private char gender;

    // Constructor
    public AnimalTask(String name, String breed, int age, char gender) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
    }

    // Abstract method to be implemented by subclasses
    public abstract void makeSound();

    // Getters for the attributes
    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "AnimalTask{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
