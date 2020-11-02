package com.Abdur.Tugas3.Nomer3;

public class Ibu {
    private int IDIbu,UmurIbu;
    private String NamaIbu;

    public Ibu(int idIbu,String namaIbu,int umurIbu){
        this.IDIbu = idIbu;
        this.NamaIbu = namaIbu;
        this.UmurIbu = umurIbu;
    }

    public int getIDIbu() {
        return IDIbu;
    }

    public String getNamaIbu() {
        return NamaIbu;
    }

    public int getUmurIbu() {
        return UmurIbu;
    }
}
