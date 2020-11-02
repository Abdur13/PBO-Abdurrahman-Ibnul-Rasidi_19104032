package com.Abdur.Modul2.Inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        A superclass = new A();
        B subclass = new B();

        System.out.println("Masukkan Data ke SuperClass");
        superclass.x = 10;
        superclass.y = 50;
        superclass.printXY();

        subclass.x = 30;
        subclass.y = 40;
        subclass.z = 10;
        subclass.printXY();
        subclass.sunValue();
    }
}
