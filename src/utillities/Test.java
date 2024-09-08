package utillities;

import day27_accessModifiers.Data;

public class Test {
    public static void main(String[] args) {
        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method1();
        Data.method2();

        Data obj= new Data();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        Data.method3();
        Data.method4();

    }
}
