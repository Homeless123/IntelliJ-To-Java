package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public final class CydeoDewStudent extends Person {
    private final String id;
    private String batchName;
    private int batchNumber;

    public final static String programmingLanguage;

    public CydeoDewStudent(String name, char gender, LocalDate birthday, String id, String batchName, int batchNumber) {
        super(name, gender, birthday);
        if (getAge()<18){
            System.err.println("Invalid Age: "+ getAge());
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        //      Más flexible, fácil de actualizar si cambian los nombres de los lotes.
        ArrayList list = new ArrayList();
        list.addAll(Arrays.asList("Zero to Hero","Alumni Dev"));
        if (! list.contains(batchName)) {
            System.err.println("Invalid batch name: " + batchName);
            System.exit(1);
        }
        //    Más rápido para listas pequeñas y fija

        /*
        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
            this.batchName = batchName;
        } else { // otherwise: if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + " \nNo such a batch at Cydeo");
            System.exit(1);
        }

         */
        this.batchName = batchName;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0){
            System.err.println("Invalid batch number: " + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating "+programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking "+programmingLanguage);
    }
}
/*
1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables

 */
