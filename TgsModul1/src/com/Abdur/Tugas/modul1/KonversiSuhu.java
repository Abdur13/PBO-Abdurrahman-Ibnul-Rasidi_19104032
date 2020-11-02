package com.Abdur.Tugas.modul1;

public class KonversiSuhu {
    //Metode untuk menkonversi Suhu dari Celcius ke Fahrenheit
    public float Celcius_Fahrenheit(float suhu){
        float hasil = (suhu * 9/5) + 32;
        return hasil;
    }
    //Metode untuk menkonversi Suhu dari Fahrenheit ke Kelvin
    public float Fahrenheit_Kelvin(float suhu){
        float hasil = (suhu - 32) * 5/9 + 273;
        return hasil;
    }
    //Metode untuk menkonversi Suhu dari Kelvin ke Reamur
    public float Kelvin_Reamur(float suhu){
        float hasil = (suhu - 273) * 4/5;
        return hasil;
    }
    //Metode untuk menkonversi Suhu dari Reamur ke Celcius
    public float Reamur_Celcius(float suhu) {
        float hasil = suhu * 5 / 4;
        return hasil;
    }
}
