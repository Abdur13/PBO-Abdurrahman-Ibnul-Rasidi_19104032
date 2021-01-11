package com.Abdur.Modul1.Constructor;

public class Manusia {
    private String nama;
    private int umur;

    //constructor 1 - Tanpa Parameter
    public Manusia(){}
    //constructor 2
    public Manusia(String nama){
        this.nama = nama;
    }
    //constructor 3
    public Manusia(String nama,int umur){
        this.nama = nama;
        this.umur = umur;
    }
    //Method
    public String getNama(){
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur(){
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
