package com.Abdur.Tugas.modul1;

public class BiodataKaryawan {
    private static String Nama = "Bachtiar Arifin";
    private static String TTL = "Rumah Bidan,04 April 2000";
    private static String Alamat = "jln. Dimana mana Antartika";
    private static String kelamin = "Laki laki Tulen";
    private static String Status = "Cari Jodoh";
    private static String Riwayat = "Lulusan S1 Software Engineering 2023";
    private static String Email = "BahtiarArifin@gmail.com";
    private static String NoHP = "081321454678";

    public static void main(String[] args) {
        //Output Biodata Karyawan PT Apa Ajah
        System.out.println( " ==== Biodata Karyawan PT Apa Ajah ==== ");
        System.out.println("Nama Lengkap\t\t: " + Nama);
        System.out.println("Tempat Tanggal Lahir\t\t:"+TTL);
        System.out.println("Alamat Rumah \t\t: " + Alamat);
        System.out.println("Jenis Kelamin \t\t: " + kelamin);
        System.out.println("Status Pernikahan \t\t" + Status);
        System.out.println("Riwayat Pendidikan\t\t"+Riwayat);
        System.out.println("Email yang dapat dihubungi\t\t: " + Email);
        System.out.println("No HP yang dapat dihubungi\t\t: " + NoHP);
    }
}
