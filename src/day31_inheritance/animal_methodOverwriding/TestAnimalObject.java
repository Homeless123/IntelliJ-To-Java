package day31_inheritance.animal_methodOverwriding;

public class TestAnimalObject {

    public static void main(String[] args) {
        System.out.println();

        Cat cat = new Cat("Emily","Bengle",'F',4,"Small","Black");

        Dog dog = new Dog("Max","Husky",'M',7,"Large","White");

        Lion lion = new Lion("Simba","Afrikan Lion",'F',10,"Large","Yellow",true);

        Eagle eagle = new Eagle("Bella","American Eagle",'F',5,"Medium","Black and White");

        System.out.println(cat);
        cat.eat();
        cat.sleep();
        System.out.println(dog);
        dog.eat();
        dog.sleep();
        System.out.println(lion);
        lion.eat();
        lion.sleep();
        System.out.println(eagle);
        eagle.eat();
        eagle.sleep();
        System.out.println("********************************************************");








    }


}
