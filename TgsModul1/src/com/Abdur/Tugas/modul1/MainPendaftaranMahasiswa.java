package com.Abdur.Tugas.modul1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainPendaftaranMahasiswa {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("====== Pendaftaran Mahasiswa Baru IT Telkom Purwokerto ======");

        //Input nama lengkap
        System.out.println("Masukkan Nama Lengkap\t: ");
        String Nama = scan.nextLine();
        //Input Tempat Tanggal Lahir
        System.out.println("Masukkan TTL\t\t\t: ");
        String TTL = scan.nextLine();
        //Input Alamat Rumah
        System.out.println("Masukkan Alamat\t\t\t: ");
        String Alamat = scan.nextLine();
        //Input Agama Yanf Di anut
        System.out.println("Masukkan Agama\t\t\t: ");
        String Agama = scan.nextLine();
        //Input Jenis Kelamin
        System.out.println("Masukkan Jenis Kelamin\t\t\t: ");
        String JenisKelamin = scan.nextLine();
        //Input Pilihan Jurusan
        System.out.println("=== FAKULTAS TEKNIK TELEKOMUNIKASI DAN ELEKTRO ===");
        System.out.println("S1 Teknik Telekomunikasi");
        System.out.println("S1 Teknik Elektro");
        System.out.println("S1 Biomedis");
        System.out.println("D3 Teknik Telekomunikasi");
        System.out.println();

        System.out.println(" ==== FAKULTAS INFORMATIKA ==== ");
        System.out.println("S1 Teknik Informatika");
        System.out.println("S1 Software Engineering");
        System.out.println("S1 Sistem Informasi");
        System.out.println("S1 Sains Data");
        System.out.println();

        System.out.println(" ==== FAKULTAS REKAYASA INDUSTRI DAN DESAIN ====");
        System.out.println("S1 Design Komunikasi Visual");
        System.out.println("S1 Teknik Industri");
        System.out.println("S1 Teknik Logistik");
        System.out.println();
        System.out.println("Masukkan Pilihan Jurusan\t: ");
        String PilJurusan = scan.nextLine();
        //Input Email
        System.out.println("Masukkan Email\t\t\t: ");
        String Email = scan.nextLine();
        //Input Nomer HP
        System.out.println("Masukkan Nomer HP\t\t\t: ");
        String NoHP = scan.nextLine();
        //Input Nilai
        System.out.println("Masukkan Nilai\t\t\t: ");
        int Nilai = scan.nextInt();

        Mahasiswa mahasiswa = new Mahasiswa(Nama,TTL,Alamat,Agama,JenisKelamin,PilJurusan,Email,NoHP,Nilai);//Deklarasi Objek

        //Output Data Mahasiswa Baru IT Telkom Purwokerto
        System.out.println();
        System.out.println(" === DATA CALON MAHASISWA IT TELKOM PURWOKERTO === ");
        System.out.println("Nama\t\t\t: " + mahasiswa.Nama);
        System.out.println("Tempat Tanggal Lahir\t\t: " + mahasiswa.TTL );
        System.out.println("Alamat Rumah\t\t\t: " + mahasiswa.Alamat);
        System.out.println("Agama\t\t\t: " + mahasiswa.Agama);
        System.out.println("Jenis Kelamin \t\t\t: " + mahasiswa.JenisKelamin);
        System.out.println("Jurusan Yang Diambil \t\t\t: " + mahasiswa.PilJurusan);
        System.out.println("Email Aktif\t\t\t: " + mahasiswa.email);
        System.out.println("Nomer HP yang dapat dihubungi\t\t\t:" + mahasiswa.NoHP);
        System.out.println("Nilai \t\t\t: " + mahasiswa.Nilai);
        System.out.println();
        System.out.println( " ***** TERIMAKASIH TELAH MELAKUKAN PENDAFTARAN ***** ");
    }
}
