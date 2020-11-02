package com.Abdur.Praktikum3.Asosiasi;

public class Mahasiswa {
    private int NIM;
    private String Nama;

    public  Mahasiswa(int NIM,String Nama){
        this.NIM = NIM;
        this.Nama = Nama;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }
}
