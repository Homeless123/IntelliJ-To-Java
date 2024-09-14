package day32_finalKeyword;

import java.time.LocalDate;

class  CydeoStudent  {
    public final void language() {
        System.out.println("Java Programing");
    }
}

public final class  FinalKeyword extends CydeoStudent{

    public FinalKeyword() {

    }
 /*
    @Override
    public void language() {    //      final methods can never be overridden
        System.out.println("Python Programing");
    }
 */

    public static void main(String[] args) {
        final char gender = 'M';

        System.out.println(gender);
        //gender = 'F';
        System.out.println(gender); // F

        System.out.println("==============");

        final LocalDate dateOfBirth = LocalDate.now();
        System.out.println(dateOfBirth);
        // dateOfBirth = dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);

        System.out.println("==============");

        new CydeoStudent().language();
        new FinalKeyword().language();

        System.out.println("==============");
        final String name ="Alex";
        //name = null;
        //name="Daniel";

        System.out.println(name);

        //IF the instance variable is final, we can only getter, we can not generate setter for it

    }
}
