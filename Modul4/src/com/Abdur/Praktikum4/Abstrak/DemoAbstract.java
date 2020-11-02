package com.Abdur.Praktikum4.Abstrak;

import java.util.Random;

public class DemoAbstract {
    public static void main(String[] args) {
        Binatang[] peliharaan = {
                new Burung("Betet"),
                new Kambing("Bendot"),
                new Kucing("Mmpuss"),
                new Anjing("Mantan")};

        Binatang kesayangan;
        Random pilihan = new Random();

        kesayangan = peliharaan[pilihan.nextInt(peliharaan.length)];

        System.out.println("Binatang kesayangan Kamu : " + kesayangan);
        System.out.println("Suaranya : ");
        kesayangan.suara();
    }
}
