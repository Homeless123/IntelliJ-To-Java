package day26_statics;

public class TestEmpoyeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice");
        System.out.println(employee1);
        Employee employee2 = new Employee("Bob",'M');
        System.out.println(employee2);
        Employee employee3 = new Employee("Carl",'F',"Developer");
        System.out.println(employee3);
        Employee employee4 = new Employee("Diana", 'F', "Manager", 90000);
        System.out.println(employee4);
        Employee employee5 = new Employee("Eve", "Designer");
        System.out.println(employee5);
        Employee employee6= new Employee("John","QA",120_000);
        System.out.println(employee6);

    }



}
