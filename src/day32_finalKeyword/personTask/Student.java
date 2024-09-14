package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class Student extends Person {

    private final char grade;
    private final String studentId;

    public Student(String name, char gender,  LocalDate birthday, char grade, String studentId) {
        super(name, gender, birthday);
        this.grade = grade;
        this.studentId = studentId;
    }

    public char getGrade() {
        return grade;
    }

    public String getStudentId() {
        return studentId;
    }
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" +getBirthday() +
                " grade='" + getGrade() + '\'' +
                ", student Id=" + getStudentId() +
                '}';
    }

}
