package day36_polymorphism;

import day29_inheritance.animalTask.Animal;
import day29_inheritance.animalTask.Cat;
import day29_inheritance.animalTask.Dog;
import day30_inheritance.phoneTask.IPhone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;

public class ReferenceTypeCastings {
    public static void main(String[] args) {
        Dog dog = new Dog();
        new Dog();
        /*
        Cat cat = new Dog();
        Inheritance: Both Cat and Dog extend Animal, but they are different subclasses of Animal.
        You cannot assign an instance of Dog to a Cat reference, as they do not have an "is-a" relationship.
        Casting: Even if you try explicit casting like Cat cat = (Cat) new Dog();, this will still result in a ClassCastException
        at runtime because a Dog cannot be treated as a Cat.
         */

        Animal animal = (Animal) new Dog();// implicit casting
        animal.setInfo("MAx","German Shepherd",'M',4,"Small","Black");

        animal.eat();
        animal.sleep();
        animal.drink();
        dog.bark(); // --- this will call the bark() method in Dog class
       // animal.bark(); --- this will call the overridden bark() method in Dog class not Animal class
        // is a downcasting method
        ( (Dog)animal ).bark(); // downcasting method in Animal class   */ MAx is barking

        Dog d = (Dog) animal; // this is a downcasting, but it is recommended and can avoid ClassCastException
        d.bark(); // this will call the bark() method in Dog class
        /*
        ((Cat)animal).scratch(); // downcasting, but it is recommended and can avoid ClassCastException
        Dog can not be converted to Cat, because there is not "IS A" relationship between dog and cat
         */
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        Phone phone = new Nokia("3310", "Medium", "Black", 99); // Nokia class extends Phone class
        phone.call(911); // calling the call() method in Phone class
        phone.text(911); // calling the text() method in Phone class
        ((Nokia) phone).selfDefense(); // like this only possible and this is donwcasting method
        new Nokia("G10", "Medium", "Black", 99).selfDefense(); // Nokia class extends Phone class

            //  Error message ClassCastException:
        ( (IPhone)phone ).faceTime(123);  // Nokia can not be converted to Iphone, because there is not "IS A" relationship between Nokia and IPhone
        /*
        phone.selfDefense(); // calling the selfDefense() method in Phone class and getting error as selfDefense() is not in Phone class
        new Nokia("G10", "Medium", "Black", 99).selfDefense(); // Nokia class extends Phone class

        *)calling the selfDefense() method in Nokia class not Phone class
         */





    }
}
