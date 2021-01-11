package com.Abdur.Tugas2.Nomer2;

public class Kucing extends Binatang {

    //Inisiasi variabel
    public String nama;
    public static String Mengeong;

    //Method getNama untuk mencetak nama binatangnya
    public void getNama(){
        System.out.println("Nama Binatang\t:" + nama);
    }
    //Method Ngeong untuk mencetak aktivitas kucing
    public void mengeong(){
        System.out.println("Aktivitas\t:" + Mengeong);
    }
}
