package day35_polymorphism;

import day31_inheritance.shape_methodOverwriting.Circle;
import day33_abstraction.employeeTest.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;
import day35_polymorphism.transportationTask.Car;

import java.util.Arrays;

public class Polymorphism {
    public static void main(String[] args) {
        Dog dog= new Dog("Max","Husky",'M', 3, "Medium", "White");

        Cat cat= new Cat("Tom","Persian",'M', 2, "Small", "Black");

        Tiger tiger= new Tiger("Lionel","Panther",'M', 5, "Large", "Golden");

        Eagle eagle= new Eagle("Eagle","Golden",'M', 2, "Small", "Golden");

        Lion lion= new Lion("Simba","Lion",'M', 5, "Large", "Golden");

        Parrot parrot= new Parrot("Polly","Parrot",'F', 1, "Small", "Black");

        Dolphin dolphin= new Dolphin("Dolly","Dolphin",'F', 1, "Small", "White");

        Shark shark= new Shark("Hammerhead","Shark",'M', 3, "Large", "Black");

        Duck duck= new Duck("Daffy","Duck",'F', 1, "Small", "White");


        // Polymorphism: Call methods based on object type
        Animal[] animals= {dog, cat, tiger, eagle, lion};
        Animal animal = duck;
        Animal animal1 = parrot ;
        Animal animal2 = dolphin;
        Animal animal3 = shark;
        Animal animal4 = cat;
        Animal animal5 = lion;

        System.out.println("________________________________");

        String str = "JAVA";

        Integer i = 1230;

        Boolean b = true;

        Double d = 3.14;

        Circle circle = new Circle(5);

        Tesla tesla = new Tesla( "Model S", "Red", 2021, 80000.0);
        Honda honda = new Honda("Civic", "Blue", 2020, 60000.0);
        Audi audi = new Audi("A4", "Black", 2019, 70000.0);

        Teacher teacher = new Teacher("Jane Doe", 40, 'F', "987654321", "Teacher", 8000);
        Tester tester = new Tester("Bob Doe", 35, 'M', "555555555", "Tester", 9000);
        Developer developer = new Developer("Alice Doe", 28, 'F', "222222222", "Developer", 12000,"Java");
        Driver driver = new Driver("Mike Doe", 32, 'M', "333333333", "Driver", 10000);
        // polymorphism: Use objects[] to call methods based on object type
        Object objects[] = {str, i, b, d, circle, tesla, honda, audi, };
        System.out.println(Arrays.toString(objects));
        Object [] employees = {teacher, tester, developer, driver};
        System.out.println(Arrays.toString(employees));

        // polymorphism: Call methods based on object type using a common interface

       // Employee employee = new Tester("Bob Doe", 35, 'M', "555555555", "Tester", 9000);
       // Employee employee = new Teacher("Jane Doe", 40, 'F', "987654321", "Teacher", 8000);
      //  Employee employee = new Developer("Alice Doe", 28, 'F', "222222222", "Developer", 12000,"Java");
        Employee employee = new Driver("Mike Doe", 32, 'M', "333333333", "Driver", 10000);
        employee.work();// Polymorphism: Call methods based on object type using a common interface
                        // is working or coding or driving or testing






    }
}
