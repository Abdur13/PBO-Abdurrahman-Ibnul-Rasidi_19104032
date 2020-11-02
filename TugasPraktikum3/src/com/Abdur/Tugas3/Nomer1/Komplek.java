package com.Abdur.Tugas3.Nomer1;

import java.util.ArrayList;

public class Komplek {
    private String IDKomplek;
    private String NamaKomplek;
    private int JmlhRumah =0;
    private ArrayList<String> IDRumah = new ArrayList<>();

    public Komplek(String idKomplek,String namaKomplek){
        this.IDKomplek = idKomplek;
        this.NamaKomplek = namaKomplek;
    }
    public void addRumah(String idRumah){
        this.IDRumah.add(idRumah);
        JmlhRumah = this.IDRumah.size();
    }
    public String getIDKomplek(){return IDKomplek;}

    public void getIDKomplek(String iDKomplek){
        this.IDKomplek = iDKomplek;
    }

    public String getNamaKomplek() {
        return NamaKomplek;
    }

    public void setNamaKomplek(String namaKomplek) {
        NamaKomplek = namaKomplek;
    }

    public int getJmlhRumah() {
        return JmlhRumah;
    }

    public void setJmlhRumah(int jmlhRumah) {
        JmlhRumah = jmlhRumah;
    }

    public ArrayList<String> getIDRumah() {
        return IDRumah;
    }

    public void setIDRumah(ArrayList<String> IDRumah) {
        this.IDRumah = IDRumah;
    }
    public void getDataKomplek(){
        System.out.println("ID Komplek\t\t: " + getIDKomplek());
        System.out.println("Nama Komplek\t: " + getNamaKomplek());
        System.out.println("Jumlah Rumah\t: " + getJmlhRumah());

        for (int i=0; i<JmlhRumah; i++){
            System.out.println(i+1+"."+getIDRumah().get(i));
        }
    }
}
