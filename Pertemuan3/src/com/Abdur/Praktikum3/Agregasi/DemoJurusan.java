package com.Abdur.Praktikum3.Agregasi;

import java.util.ArrayList;
import java.util.List;

public class DemoJurusan {
    public static void main(String[] args) {
        Jurusan jurusan = new Jurusan("19104032", "Software Engineering");

        Mahasiswa mahasiswa1 = new Mahasiswa("Bambang\t",19104069);
        Mahasiswa mahasiswa2 = new Mahasiswa("Jamet\t\t",19104099);
        Mahasiswa mahasiswa3 = new Mahasiswa("Mukidi\t",19104088);

        //List Mahasiswa dari class Demo
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        mahasiswaList.add(mahasiswa1);
        mahasiswaList.add(mahasiswa2);
        mahasiswaList.add(new Mahasiswa("Pudidi\t ",19104055));

        //Copas data dari class"Demo Jurusan" ke class "Jurusan"
        jurusan.setMahasiswaList(mahasiswaList);
        //Memasukkan data langsung ke class jurusan
        jurusan.addMahasiswa(mahasiswa3);

        jurusan.printDataJurusan();
    }
}
