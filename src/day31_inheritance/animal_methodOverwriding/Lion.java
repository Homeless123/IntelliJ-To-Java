package day31_inheritance.animal_methodOverwriding;

public class Lion extends Animal {

    private boolean isAfrican;

    // Getter and setter for isAfrican
    public boolean isAfrican() {
        return isAfrican;
    }

    public void setAfrican(boolean african) {
        isAfrican = african;
    }

    // Constructor that includes the specific Lion attribute isAfrican
    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfrican) {
        super(name, breed, gender, age, size, color); // Calls the Animal class constructor
        setAfrican(isAfrican); // Initializes isAfrican
    }

    // Overriding the eat method with specific behavior for Lion
    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    // Overriding the drink method, but using the superclass implementation
    @Override
    public void drink() {
        super.drink();
    }

    // Specific method for Lion
    public void roar() {
        System.out.println("Lion " + getName() + " is roaring");
    }
    @Override
    public void sleep() {
        System.out.println("Lion " + getName() + " is sleeping 18 hours");
    }

    // Custom toString method, adding isAfrican to the string representation
    @Override
    public String toString() {
        return super.toString().replace("}", "") + ", African='" + isAfrican + '\'' + '}';
    }
}
