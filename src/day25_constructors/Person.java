package day25_constructors;

import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
name
age
gender
dateOfBirth
isMarried
isEmployed

Add a constructor that can set all the fields once an object is created

toString(), eat(String food), sleeping(), drink(String drink)
 */
public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;
    public boolean isMarried;
    public boolean isEmployed;

    // Constructor that initializes all fields

    public Person(String name, int age, char gender, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }

    // Method to represent the object as a string
    public String toString() {
        // Correcting the date format pattern
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("y/MMMM/EEEE")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }
    public void eat(String food){
        System.out.println(name+" is eating "+food+" .");
    }
    public void sleping(){
        System.out.println(name+" is sleeping .");
    }
    public void drinking(String drink){
        System.out.println(name+" is drinking "+drink+" .");
    }
}
