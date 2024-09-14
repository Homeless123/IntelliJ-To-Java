package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Person {
    private String name;
    private final char gender;
    private final int age;
    private final LocalDate birthday;
    public static int numberOfHead;

    // Static block to initialize static variables
    static {
        numberOfHead = 1;
    }

    // Constructor to initialize all fields
    public Person(String name, char gender,  LocalDate birthday) {
        setName(name); // Setting name using setter method

        // Check if gender is valid (M or F)
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender " + gender);
            System.exit(1);
        }
        this.gender = gender; // Assign gender after validation

        this.birthday = birthday; // Assign birthday directly


        this.age = LocalDate.now().getYear()-getBirthday().getYear(); // Assign age after validation

    }

    // Getter methods
    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Additional methods
    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public final void breath() {
        System.out.println(name + " is breathing");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", birthday=" + getBirthday() +
                '}';
    }
}
/*
Variables:
    name, gender, age, dateOfBirth
    numberOfHead

Methods:
    eat(), drink(), sleep()
    breath()
 */