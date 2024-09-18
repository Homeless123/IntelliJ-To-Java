package day36_polymorphism;

import day33_abstraction.employeeTest.Developer;
import day33_abstraction.employeeTest.Employee;
import day33_abstraction.employeeTest.Tester;

public class ReferenceTypeCastings1 {
    public static void main(String[] args) {
        Employee employee = new Developer("Alice Doe", 28, 'F', "222222222", "Developer", 12000,"Java");
        employee.work();
    //  System.out.println(employee.getProgrammingLanguage() );  we need to change
        System.out.println(((Developer)employee).getProgrammingLanguage() ); // casting the reference to Developer class
    //  Tester tester =(Tester) employee; // u get ClassCastException: BUG OR ERROR





    }
}
