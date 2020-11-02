package com.Abdur.Tugas2.Nomer3;

//Class Pacar  yang mewarisi class mahasiswa
public class Pacar extends Mahasiswa {
    //Inisiasi variabel (Nama Pacar,Lama Hubungan)
    public String namaPacar = "Masih dalam Pencarian -_-";
    public int lamaHubungan = 0;

    //method getStatus
    public void getStatus(){
        System.out.println("Nama Pacar\t\t:" + namaPacar);
        System.out.println("Lama Berhubungan:" + lamaHubungan);
    }
}
