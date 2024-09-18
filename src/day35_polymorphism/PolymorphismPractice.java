package day35_polymorphism;

import day34_abstraction.animalTask.*;
import day35_polymorphism.animalTask.AnimalTask;
import day35_polymorphism.animalTask.Dog;
import day35_polymorphism.animalTask.Cat;
import day35_polymorphism.transportationTask.Audi;
import day35_polymorphism.transportationTask.Car;
import day35_polymorphism.transportationTask.CydeoCar;
import day35_polymorphism.transportationTask.Tesla;

public class PolymorphismPractice {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        AnimalTask animalTask1 = new Dog("Max", "Bulldog", 5, 'M');  // Upcasting
        AnimalTask animalTask2 = new Cat("Luna", "Siamese", 3, 'F');  // Upcasting

        // Call makeSound() method based on the object type
        animalTask1.makeSound(); // Max is barking
        animalTask2.makeSound(); // Luna is meowing
        boolean isCat = animalTask2 instanceof Cat;
        System.out.println("isCat = " + isCat);

        // Checking the actual object type using 'instanceof'
        System.out.println(animalTask1 instanceof AnimalTask); // true
        System.out.println(animalTask1 instanceof Dog);    // true
        System.out.println(animalTask1 instanceof Cat);    // false


        System.out.println(animalTask2 instanceof AnimalTask); // true
        System.out.println(animalTask2 instanceof Dog);    // false
        System.out.println(animalTask2 instanceof Cat);    // true
        System.out.println("--------------------------------");

        Animal tiger = new Tiger("Tiger", "Bengal", 'M', 5, "Large", "Golden");
       // tiger.hunt();   Tiger is hunting but is not
        tiger.eat(); // Tiger is eating
        tiger.drink(); // Tiger is drinking
        tiger.sleep(); // Tiger is sleeping
        Animal eagle = new Eagle("Eagle", "Hawk", 'M', 3, "Large", "Blue");
       // eagle.fly();   Eagle is flying
        eagle.eat(); // Eagle is eating
        eagle.drink(); // Eagle is drinking
        eagle.sleep(); // Eagle is sleeping

        Flyable obj1 = new Eagle("Eagle", "Hawk", 'M', 3, "Large", "Blue");
        //obj1.eat(); // Eagle is eating
        //obj1.drink(); // Eagle is drinking
        //obj1.sleep(); // Eagle is sleeping
        obj1.fly(); // Eagle is flying
        System.out.println("canFly "+obj1.canFly); // true

        Lion lion = new Lion("Lion", "Asian", 'M', 5, "Medium", "Golden");
        Parrot parrot = new Parrot("Parrot", "Sparrow", 'F', 2, "Small", "Red");
        Dolphin dolphin = new Dolphin("Dolphin", "Clownfish", 'F', 1, "Small", "White");
        Shark shark = new Shark("Shark", "Whale Shark", 'M', 3, "Large", "Black");
        Eagle eagle2 = new Eagle("Eagle", "Hawk", 'M', 3, "Large", "Blue");
        Duck duck = new Duck("Duck", "Mallard", 'M', 2, "Small", "Yellow");
        CydeoCar cydeoCar = null;

        // Flyable birds[] = {lion, parrot, dolphin, shark, eagle2}; ** Lion dolphin shark and  are not flyable so they cannot be Polymorphisms called
        Flyable birds[] = {parrot, eagle2};
        Swimable fish[] = {dolphin, shark, duck, cydeoCar};
        Playable animals[] = {parrot, duck};
        /*
        boolean isAnimal = cydeoCar instanceof Animal;
        System.out.println(isAnimal); // false
        */
        System.out.println("--------------------------------");

        Car car = new Tesla("Tesla", "Model S", "Red", 2022, 25000);
        //Car car2 = new CydeoCar("Cydeo", "CyberTruck", "Blue", 2023, 30000);
        //Car car3 = new Audi("Audi", "A4", "Black", 2021, 20000);

        boolean isTesla = car instanceof Tesla;
        System.out.println("isTesla "+isTesla); // true
        boolean isCydeo = car instanceof CydeoCar;
        System.out.println("isCydeo "+isCydeo); // false
        boolean isAudi = car instanceof Audi;
        System.out.println("isAudi "+isAudi); // false

        boolean isElectric = car instanceof Tesla;
        boolean isAutoPilot = car instanceof Tesla;
        boolean isAutoPark = car instanceof Tesla;

        // boolean isToyota = car instanceof Toyota;
        //  System.out.println(isToyota); // false
        System.out.println("///****///");
        System.out.println("isTesla = " + isTesla);
        System.out.println("isAudi = " + isAudi);
        System.out.println("isElectric = " + isElectric);
        System.out.println("isAutoPilot = " + isAutoPilot);
        System.out.println("isAutoPark = " + isAutoPark);


    }
}
