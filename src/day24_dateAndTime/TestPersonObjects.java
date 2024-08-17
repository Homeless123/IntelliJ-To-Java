package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person[] people={new Person(),new Person(),new Person(),new Person(),new Person() };
        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Ahmet",'M', LocalDate.of(1994,1,1));
people[2].setInfo("Abril",'W', LocalDate.of(1995,1,24));
people[3].setInfo("Bern",'M', LocalDate.of(1999,3,15));
people[4].setInfo("David",'M', LocalDate.of(2000,11,19));
        ArrayList<Person> studentList=new ArrayList<>();
        studentList.addAll(Arrays.asList(people) );
        System.out.println(studentList);

        //

    }
}
