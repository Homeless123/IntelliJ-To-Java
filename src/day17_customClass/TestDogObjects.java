package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Max";
        dog1.breed = "Husky";
        dog1.gender = 'M';
        dog1.age = 10;
        dog1.size = "Large";
        dog1.color = "White";

       Dog dog2 = new Dog();
        dog2.name="Loki";
        dog2.breed = "Golden Retriever";
        dog2.gender = 'F';
        dog2.age = 2;
        dog2.size = "Small";
        dog2.color = "Orange";

        Dog dog3 = new Dog();
        dog3.setInfo("Mike","Chow Chow",'M',5,"Medium","Brown");

        Dog dog4 = new Dog();
        dog4.setInfo("Karabas","Bulldog",'F',7,"Small","Gray");


        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        dog4.eat();
        dog2.drink();
    }
}

