package day27_accessModifiers;

public class StaticBlock {
    public StaticBlock() {
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        System.out.println("Main Block");
        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }  static {// only run 1 time
        System.out.println("Static Block");
    }
}

