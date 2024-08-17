package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {

      Employee employee1 = new Employee();
      employee1.setInfo("Sumeye",28,'F',"Java Developer",95000,"A12");

      Employee employee2 = new Employee();
      employee2.setInfo("Alex",31,'M',"Back-end Developer",97500,"B14");

      Employee employee3 = new Employee();
      employee3.setInfo("Ahmet",30,'M',"DEW",105000,"Q17");

      employee2.age=39;
      employee3.name="Lusi";
      employee3.gender='F';


        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

     employee3.work();


    }
}
