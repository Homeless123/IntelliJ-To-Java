package day32_finalKeyword.personTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {
        Person person = new Person("Daniel",'M', LocalDate.of(1991,1,25));
        System.out.println(person);
        Employee employee = new Employee("Maria",'F',LocalDate.of(1996,5,23),"Ceo",45_000);
        System.out.println(employee);
        Student student = new Student("Sophia",'F',LocalDate.of(1992,4,15),'9',"20241234A");
        System.out.println(student);
        Student student1 = new Student("Sophia", 'F', LocalDate.of(1992, 4, 15), 'A', "20241234");

        System.out.println(student1);  // Print details of the student object
        Employee employee1 = new Employee("John", 'M', LocalDate.of(1985, 5, 20), "Software Engineer", 95000);

        System.out.println(employee1);  // Print details of the employee object

        employee1.work();  // Test the work method
    }
}
