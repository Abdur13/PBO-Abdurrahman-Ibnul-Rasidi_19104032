package com.Abdur.Praktikum3.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class Jurusan {

    private String KodeJurusan;
    private String NamaJurusan;
    private List<Mahasiswa> mahasiswaList = new ArrayList<>();

    public Jurusan(String KodeJurusan,String NamaJurusan){
        this.KodeJurusan = KodeJurusan;
        this.NamaJurusan = NamaJurusan;
    }

    public String getKodeJurusan(){return KodeJurusan;}
    public void setKodeJurusan(String KodeJurusan){this.KodeJurusan = KodeJurusan;}

    public String getNamaJurusan(){return NamaJurusan;}
    public void SetNamaJurusan(String NamaJurusan){this.NamaJurusan = NamaJurusan;}

    public List<Mahasiswa> getMahasiswaList(){return mahasiswaList;}

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
    }
    public void addMahasiswa(Mahasiswa mahasiswa){mahasiswaList.add(mahasiswa);}

    public void printDataJurusan(){
        System.out.println("Nama Jurusan\t: "+getNamaJurusan());
        System.out.println("Kode Jurusan\t: "+getKodeJurusan());
        System.out.println("List Mahasiswa\t: ");
        for (Mahasiswa mahasiswa : mahasiswaList){
            System.out.println("Nama \t\t :" + mahasiswa.getNama()+"\tNIM\t\t: " + mahasiswa.getNim());
        }
    }
}
