package utillities;

//import day27_accessModifiers.Data;
//import static day27_accessModifiers.Data.d;
//import static day27_accessModifiers.Data.method3;
import static day27_accessModifiers.Data.*;// Import all static members from the Data class



public class Test2 {
    public static void main(String[] args) {
        //System.out.println(Data.d);
        // Accessing and printing the static variable 'd' directly
        System.out.println(d);
        // Calling the static method 'method3' directly
        method3();
        // Accessing and printing additional static variables
        System.out.println(e);
        System.out.println(f);
        // Calling another static method 'method4'
        method4();
 /*     // The following lines are commented out but show additional usage
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
*/
        method1();
        method2();



    }

}
