package day34_abstraction.animalTask;

public interface Playable {
    boolean isFiendly=true; // static final field
/*
    public static void main(String[] args) {
       // isFiendly = false; // can't change static final field'
        System.out.println(isFiendly);
    }
    default void method1(){
        System.out.println("Playing");
    }


 */

    public abstract void play();// not necessary have public and abstract methods


}
