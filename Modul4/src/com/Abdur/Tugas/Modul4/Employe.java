package com.Abdur.Tugas.Modul4;

public abstract class Employe {
    //Kumpulan tipe data yang akan digunakan
    protected String Nama;
    protected String NIP;
    protected float Upah;
    protected float Komisi;
    protected float TotalPenjualan;
    protected float TotalProyek;
    //Constructor
     Employe(String Nama, String NIP, float Upah, float Komisi, float TotalPenjualan, float TotalProyek){
        this.Nama = Nama;
        this.NIP = NIP;
        this.Upah = Upah;
        this.Komisi = Komisi;
        this.TotalPenjualan = TotalPenjualan;
        this.TotalProyek = TotalProyek;
    }
    public abstract void getGaji();
}
