package day36_polymorphism;

import day33_abstraction.employeeTest.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;

public class ReferenceTypeCastings1 {
    public static void main(String[] args) {
        Employee employee = new Developer("Alice Doe", 28, 'F', "222222222", "Developer", 12000,"Java");
        employee.work();
    //  System.out.println(employee.getProgrammingLanguage() );  we need to change
        System.out.println(((Developer)employee).getProgrammingLanguage() ); // casting the reference to Developer class
    //  Tester tester =(Tester) employee; // u get ClassCastException: BUG OR ERROR

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        Electric electric = new Tesla("Tesla", "Model S", "Red", 2020, 55_000);
        electric.charge();
        ( (Tesla)electric ).selfDrive();
       // electric.autoPilot(); geting error
        ( (AutoPilot)electric).selfDrive();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        Employee employee1 = new Teacher("Jane Doe", 40, 'F', "987654321", "Teacher", 8000);
        Employee employee2 = new Tester("Bob Doe", 35, 'M', "555555555", "Tester", 9000);
        Employee employee3 = new Developer("Alice Doe", 28, 'F', "222222222", "Developer", 12000,"Java");
        Employee employee4 = new Driver("Mike Doe", 32, 'M', "333333333", "Driver", 10000);

        employee1.work();
        employee2.work();
        employee3.work();
        employee4.work();









    }
}
