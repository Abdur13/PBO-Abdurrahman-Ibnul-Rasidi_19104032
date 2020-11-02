package com.Abdur.Tugas3.Nomer3;

import java.util.ArrayList;

public class Keluarga {
    private String NamaKeluarga;
    private String KotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    private ArrayList<Anak> anakArrayList = new ArrayList<>();

    public Keluarga(String namaKeluarga,String kotaAsal){
        this.NamaKeluarga = namaKeluarga;
        this.KotaAsal = kotaAsal;
    }

    public String getNamaKeluarga() {
        return NamaKeluarga;
    }

    public String getKotaAsal() {
        return KotaAsal;
    }
    public void addAnggotaKeluarga(Ayah ayah,Ibu ibu,ArrayList<Anak>anakArrayList){
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakArrayList = anakArrayList;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public ArrayList<Anak> getAnakArrayList() {
        return anakArrayList;
    }
    public void getDatakeluarga(){
        System.out.println("Nama Keluaga\t: "+getNamaKeluarga());
        System.out.println("Kota Asal\t\t: "+getKotaAsal());
        System.out.println();

        System.out.println("ID Ayah\t\t: " + getAyah().getIDAyah() +"\n" +
                "Nama Ayah\t: "+getAyah().getNamaAyah()+ "\n" +
                "Umur Ayah\t:" +getAyah().getUmurAyah());
        System.out.println();

        System.out.println("ID Ibu\t\t " + getIbu().getIDIbu() + "\n" +
                "Nama Ibu\t: " + getIbu().getNamaIbu() + "\n" +
                "Umur Ibu\t: " + getIbu().getUmurIbu());
        System.out.println();

        System.out.println("Jumlah Anak\t: " + getAnakArrayList().size());
        System.out.println();

        for (Anak anak : anakArrayList){
            System.out.println("ID Anak\t: " + anak.getIDAnak() + "\n" +
                    "Nama Anak\t: " + anak.getNamaAnak() + "\n" +
                    "Umur Anak\t: " + anak.getUmurAnak() + " tahun " + "\n" +
                    "Status Anak\t:" + anak.getStatusAnak() + "\n");
        }
    }
}
