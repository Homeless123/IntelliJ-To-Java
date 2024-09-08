package day27_accessModifiers;

public class CydeoStudent {

    // Instance variables
    public String name;
    public int age;
    public char gender;

    // Static variables
    public static String schoolName;
    public static String secretCode;

    // Constructor

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    // Static Initialization Block
    static {
        schoolName = "Cydeo";
        secretCode = "Wooden Spoon";
    }
}
