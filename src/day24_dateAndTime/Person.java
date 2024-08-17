package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Person {
    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age= LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String toString() {
        return "day24_dateAndTime.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
