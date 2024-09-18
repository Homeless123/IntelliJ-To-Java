package day35_polymorphism.animalTask;
public class Cat extends AnimalTask {

    // Constructor for Cat class
    public Cat(String name, String breed, int age, char gender) {
        super(name, breed, age, gender);
    }


    // Implementing the abstract method from AnimalTask class
    @Override
    public void makeSound() {
        System.out.println(getName() + " is meowing");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}';
    }
}