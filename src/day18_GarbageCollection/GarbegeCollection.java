package day18_GarbageCollection;

import day17_customClass.Dog;

import java.util.Locale;

public class GarbegeCollection {
    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null;

        System.out.println(s1);
                //System.out.println(s1.toUpperCase()); // ist not posibile giving error
                //System.out.println(s1.replace(null,"Hello")); no instance variable or method call by ( null )
        String a = "";
        String b = null; // not not possible
        System.out.println(a.replace("","Hello"));
        System.out.println("------------");

        String str1 = "Python";
        str1="CYDEO";
        System.out.println(str1);

        System.out.println("---------------------");

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 10;
        dog1.size = "Large";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog1.setInfo("Mike","Chow Chow",'M',5,"Medium","Brown");

        //          dog1= null;  or     dog1=dog2  its going garbage collection

        dog1 = dog2;
        System.out.println(dog1);
        System.out.println(dog2);

        //new Dog().finalize();


    }
}
