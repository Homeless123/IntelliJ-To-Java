package day35_polymorphism.animalTask;

public class Dog extends AnimalTask {

    // Constructor for Dog class
    public Dog(String name, String breed, int age, char gender) {
        super(name, breed, age, gender);
    }

    // Implementing the abstract method from AnimalTask class
    @Override
    public void makeSound() {
        System.out.println(getName() + " is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}
