package com.Abdur.Tugas2.Nomer1;

//Class club
public class Club {
    String nama;
    int TahunBerdiri;
    String Stadion;
    int JuaraUCL;
    String Deskripsi;

    public Club(){ }
    public Club(String nama){
        this.nama = nama;
    }
    public Club(String nama,String Deskripsi){
        this.nama = nama;
        this.Deskripsi = Deskripsi;
    }
    public Club(String nama,int TahunBerdiri,String Stadion){
        this.nama = nama;
        this.TahunBerdiri = TahunBerdiri;
        this.Stadion = Stadion;
    }
    public Club(String nama,int TahunBerdiri,String Stadion,int JuaraUCL,String Deskripsi){
        this.nama = nama;
        this.TahunBerdiri = TahunBerdiri;
        this.Stadion = Stadion;
        this.JuaraUCL = JuaraUCL;
        this.Deskripsi = Deskripsi;
    }
    public void getTeam(){
        System.out.println("Nama Club\t: " + nama);
        System.out.println("Tahun Berdiri\t: " + TahunBerdiri);
        System.out.println("Nama Stadion\t: " + Stadion);
        System.out.println("Juara UCL\t\t: " + JuaraUCL);
        System.out.println("Deskripsi Club\t:" + Deskripsi);
    }
}
