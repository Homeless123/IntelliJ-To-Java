package day17_customClass;

public class Dog {

    public String name;  // instance variable
    public String breed; // instance variable
    public String size; // instance variable
    public char gender; // instance variable
    public int age; // instance variable
    public String color; // instance variable
// Initialize an array of Dog objects and set their info

                        //      Max         Husky       Large           M       10          White

    public void setInfo(String name, String breed, char gender, int age,String size, String color){
        this.name = name;  // this keyboard is used for calling the instance variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
        //      ths method can help us to set all the information of the dog at once
        // you have to use  (this.) method it's must for to give others class
    }

    // instance method doesn't creat => static <=

    public void eat(){
        System.out.println(name+" is eat");
    }
    public void drink(){
        System.out.println(name+" is drink water");
    }


    public String toString() {// to avoid getting hash-code when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
