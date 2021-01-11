package com.Abdur.Praktikum3.Asosiasi;

public class DemoKuliah {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Zeus");
        mahasiswa1.setNIM(19104055);

        Mahasiswa mahasiswa2= new Mahasiswa(19104025,"Banu");

        Dosen dosen = new Dosen();
        dosen.setKodeDosen("POV");
        dosen.setNimMHS(mahasiswa1.getNIM());
        dosen.setNimMHS(mahasiswa2.getNIM());

        System.out.println("Kode Dosen\t: " + dosen.getKodeDosen());
        System.out.println("Membimbing Mahasiswa\t: " );

        for (int i=0;i<dosen.getJmlhMahasiswa(); i++){
            System.out.println("- "+dosen.getNimMHS());
        }
    }
}
