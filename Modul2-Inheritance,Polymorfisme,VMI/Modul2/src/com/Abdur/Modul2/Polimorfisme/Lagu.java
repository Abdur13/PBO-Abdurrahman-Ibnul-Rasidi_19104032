package com.Abdur.Modul2.Polimorfisme;

public class Lagu {
    public String judul;
    public String pencipta;

    public Lagu(String judul){
        this.judul = judul;
    }
    public Lagu(String judul,String pencipta){
        this.judul = judul;
        this.pencipta = pencipta ;
    }
    public void getDataLagu(){
        System.out.println("Judul\t: " + judul);
        System.out.println("Pencipta\t: " + pencipta);
    }
}
