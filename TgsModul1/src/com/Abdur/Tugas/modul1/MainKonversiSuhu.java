package com.Abdur.Tugas.modul1;

import java.util.Scanner;

public class MainKonversiSuhu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        KonversiSuhu konversiSuhu = new KonversiSuhu();//Deklarasi Objek

        //Input Suhu Dalam Celcius
        System.out.println("Masukkan suhu Dalam Celcius\t ");
        float suhu = scan.nextFloat();

        //Cetak konversi Suhu dari Celcius Ke Fahrenheit
        Float suhu1 = konversiSuhu.Celcius_Fahrenheit(suhu);
        System.out.println("Celcius ke Fahrenheit\t\t: " + suhu1);
        //Cetak Konversi Suhu Dari Fahrenheit Ke Kelvin
        Float suhu2 = konversiSuhu.Fahrenheit_Kelvin(suhu1);
        System.out.println("Fahrenheit ke Kelvin\t: " + suhu2);
        //Cetak Konversi Suhu dari Kelvin ke Reamur
        Float suhu3 = konversiSuhu.Kelvin_Reamur(suhu2);
        System.out.println("kelvin ke Reamur \t\t: " + suhu3);
        //Cetak Konversi Suhu dari Reamur ke Celcius
        Float suhu4 = konversiSuhu.Reamur_Celcius(suhu3);
        System.out.println("Reamur ke Celcius \t\t: " + suhu4);
    }
}
