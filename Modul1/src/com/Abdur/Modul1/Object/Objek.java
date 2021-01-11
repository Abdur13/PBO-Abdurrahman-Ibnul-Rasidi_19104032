package com.Abdur.Modul1.Object;

public class Objek {
    public static void main(String[] args) {
        //Deklarasi tanpa parameter
        Mahasiswa mahasiswaTanpa = new Mahasiswa();

        mahasiswaTanpa.setNama("Abdur");
        mahasiswaTanpa.setNim(19104032);

        System.out.println("Mahasiswa 1 ");
        System.out.println("Nama\t:" + mahasiswaTanpa.getNama());
        System.out.println("NIM\t\t:" + mahasiswaTanpa.getNim());

        Mahasiswa mahasiswa1 = new Mahasiswa("Bambang",19104022);
        System.out.println("Mahasiswa 2");
        System.out.println("Nama\t:" + mahasiswa1.getNama());
        System.out.println("NIM\t\t:" + mahasiswa1.getNim());

        Mahasiswa mahasiswa2 = new Mahasiswa("Suder",19104033);
        System.out.println("Mahasiswa 3");
        System.out.println("Nama\t:" + mahasiswa2.getNama());
        System.out.println("Nim\t\t:" + mahasiswa2.getNim());
    }
}
