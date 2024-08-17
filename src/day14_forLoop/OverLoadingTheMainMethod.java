package day14_forLoop;

public class OverLoadingTheMainMethod {
    public static void main(String[] args) {
        System.out.println("A");

    }
    public static void main(int[] args) {
        System.out.println("AB");
    }

    public static void main(double[] args) {
        System.out.println("ABC");
    }

    public static void main(boolean[] args) {
        System.out.println("ABCD");
    }
}
