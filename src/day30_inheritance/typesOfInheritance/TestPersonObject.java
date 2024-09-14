package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPersonObject {
    public static void main(String[] args) {
        System.out.println();
        Student student =new Student("Lucy",'F', LocalDate.of(1989,8,3),'A',"A236");
        President president = new President("Tayyip",'M',LocalDate.of(1985,03,15), LocalDate.of(2022,01,13));
        Teacher teacher = new Teacher("Ugur",'M',LocalDate.of(1983,11,01),"Turkish Teacher","C12",25_000);
        System.out.println(student);
        System.out.println(president);
        System.out.println(teacher);
        System.out.println("=============");

        student.study();
        teacher.teach();
        president.lie();
        System.out.println("==============");

        student.eat("Paella");
        teacher.eat("Baklava");
        president.eat("Shit");
        System.out.println("=============");

        student.drink("Vine");
        teacher.drink("Tea");
        president.drink("Milk");

    }
}
