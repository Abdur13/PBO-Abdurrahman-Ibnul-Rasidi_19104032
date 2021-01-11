package com.Abdur.Praktikum3.Asosiasi;

public class Dosen {
    private String KodeDosen;
    private int NimMHS[] = new int[10];
    private int JmlhMahasiswa ;

    public Dosen(){}

    public String getKodeDosen() {
        return KodeDosen;
    }

    public void setKodeDosen(String kodeDosen) {
       this.KodeDosen = kodeDosen;
    }

    public int getJmlhMahasiswa() {
        return JmlhMahasiswa;
    }

    public int[] getNimMHS(int indeks) {
        return NimMHS[indeks];
    }
    public void setNimMHS(int Nim){
        NimMHS[JmlhMahasiswa] = Nim;
        JmlhMahasiswa++;
    }
}
