package day33_abstraction.employeeTest;

public class TestEmployeeObject {
    public static void main(String[] args) {
      //  Employee employee1 = new Employee("John Doe", 30, 'M', "123456789", "Software Engineer", 10000);
        // We can not create objects from an abstract class, Object MUST be created from a concrete class

        Teacher teacher = new Teacher("Jane Doe", 40, 'F', "987654321", "Teacher", 8000);
        Tester tester = new Tester("Bob Doe", 35, 'M', "555555555", "Tester", 9000);
        Developer developer = new Developer("Alice Doe", 28, 'F', "222222222", "Developer", 12000,"Java");
        Driver driver = new Driver("Mike Doe", 32, 'M', "333333333", "Driver", 10000);
        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println("==============");
        teacher.work();
        tester.work();
        developer.work();
        driver.work();
        System.out.println("==============");




    }
}
