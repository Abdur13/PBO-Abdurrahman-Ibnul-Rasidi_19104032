package com.Abdur.Tugas2.Nomer2;

//Class ikan
public class Ikan extends Binatang{

    //Variabel
    public String nama;
    public String Berenang;

    //Method getName untuk Mencetak Nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);
    }
    //Method Berenang untuk mencetak aktivitas ikan
    public void berenang(){
        System.out.println("Aktivitas\t\t: " + Berenang);
    }
}
