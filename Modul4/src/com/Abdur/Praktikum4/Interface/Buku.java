package com.Abdur.Praktikum4.Interface;

public class Buku {
    String judul,Pengarang;
    int hargaBuku;

    public Buku(String judul,String Pengarang,int hargaBuku){
        this.judul = judul;
        this.Pengarang = Pengarang;
        this.hargaBuku = hargaBuku;
    }
    public void CetakBuku(){
        System.out.println("Judul Buku : " + judul);
        System.out.println("Pengarang  : " + Pengarang);
        System.out.println("Harga Buku : " + hargaBuku);
    }
}
