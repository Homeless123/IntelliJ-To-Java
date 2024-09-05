package day25_constructors;

import java.time.LocalDate;

public class TestEmployeeObject {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jhon",30,'M',"Developer",45000, LocalDate.of(2024,01,15));
        System.out.println(e1);
        Employee e2 = new Employee("Maria",25,'F',"QA",30000,LocalDate.of(2022,06,24));
        System.out.println(e2);
    }

}
