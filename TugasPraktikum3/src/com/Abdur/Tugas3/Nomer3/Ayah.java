package com.Abdur.Tugas3.Nomer3;

public class Ayah {
    private int IDAyah,UmurAyah;
    private String NamaAyah;

    public Ayah(int idAyah,String namaAyah,int umurAyah){
        this.IDAyah = idAyah;
        this.NamaAyah = namaAyah;
        this.UmurAyah = umurAyah;
    }

    public int getIDAyah() {
        return IDAyah;
    }

    public String getNamaAyah() {
        return NamaAyah;
    }

    public int getUmurAyah() {
        return UmurAyah;
    }
}
