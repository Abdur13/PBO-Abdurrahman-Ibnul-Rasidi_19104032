package com.Abdur.Tugas3.Nomer1;

public class Rumah {
    private String IDRumah;
    private String NamaPemilik;
    private int JmlhOrang;

    public Rumah(String idRumah,String namaPemilik,int jmlhOrang){
        this.IDRumah = idRumah;
        this.NamaPemilik = namaPemilik;
        this.JmlhOrang = jmlhOrang;
    }

    public String getIDRumah() {
        return IDRumah;
    }

    public String getNamaPemilik() {
        return NamaPemilik;
    }

    public int getJmlhOrang() {
        return JmlhOrang;
    }
}
