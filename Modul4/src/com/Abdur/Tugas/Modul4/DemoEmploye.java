package com.Abdur.Tugas.Modul4;

import java.util.Random;

public class DemoEmploye {
    public static void main(String[] args) {
        Employe[] employe = {
                //Memanggil class dalam Method Array
                new Commision("Mukidi","0014055",2500000,400000,5,(float)0),
                new Salaired("Mosidik","0014069",3200000,500000,4,5),
                new ProjectPlanner("Mulia","0025088",5000000,500000,6,8)
        };
        //Random Index
        Random pilihan = new Random();
        Employe Karyawan = employe[pilihan.nextInt(employe.length)];
        //Get Gaji
        System.out.println("Semua Gaji Karyawan ");
        Karyawan.getGaji();
    }
}
