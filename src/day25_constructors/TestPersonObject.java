package day25_constructors;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person1=new Person("Macron",24,'M', LocalDate.of(2000,02,14),true,true);
        person1.eat("Pizza");
        person1.drinking("Cola");
        person1.sleping();
        System.out.println(person1);

        Person person2=new Person("Ahmet",30,'M',LocalDate.of(1993,11,19),false,true);
        person2.eat("Burger");
        person2.drinking("Fanta");
        person2.sleping();
        System.out.println(person2);

        Person person3=new Person("Josua",29,'M',LocalDate.of(1995,03,05),false,true);
        person3.eat("Macaroni");
        person3.drinking("Vine");
        person3.sleping();
        System.out.println(person3);

        Person person4=new Person("Carolina",45,'F',LocalDate.of(1975,06,13),true,true);
        person4.eat("Tortilla");
        person4.drinking("Water");
        person4.sleping();
        System.out.println(person4);

        Person person5 = new Person("Maria",22,'F',LocalDate.of(1998,9,20),false,true);
        person5.eat("Paella");
        person5.drinking("Tea");
        person5.sleping();
        System.out.println(person5);


    }
}
