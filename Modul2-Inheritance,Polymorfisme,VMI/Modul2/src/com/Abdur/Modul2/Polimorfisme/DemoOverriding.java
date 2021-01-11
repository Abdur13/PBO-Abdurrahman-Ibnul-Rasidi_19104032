package com.Abdur.Modul2.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        x supperclass = new x();
        y subclass = new y();

        supperclass.getValue("Mati Lampu");
        subclass.getValue("Mati Listrik");
    }
}
