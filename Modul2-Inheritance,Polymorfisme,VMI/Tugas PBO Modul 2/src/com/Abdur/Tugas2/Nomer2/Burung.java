package com.Abdur.Tugas2.Nomer2;

//Class Burung
public class Burung extends Binatang {

    //Inisiasi Variabel
    public String nama;
    public String Terbang;

    //Method getName untuk mencetak Nama Binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t: " + nama);

    }
    //Method terbang untuk mencetak aktivitas khususnya
    public void terbang(){
        System.out.println("Aktivitas\t\t: " + Terbang);
    }
}
