package com.Abdur.Tugas2.Nomer2;

//class demo binatang
public class DemoBinatang {
    public static void main(String[] args) {

        //Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Merpati";
        burung.makan = "Biji bijian";
        burung.tidur = "Burung Merpati tidur pada malam hari";
        burung.Terbang = "Burung merpati terbang menggunakan Sayap";

        //memanggil method burung
        System.out.println("\t\t\t==== Burung ====");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        //Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Cupang";
        ikan.makan = "Cacing Sutra";
        ikan.tidur = "Ikan cupang tidur pada malam hari";
        ikan.Berenang = "Ikan cupang berenang menggunakan sirip dan ekor";

        //Memanggil Method Ikan
        System.out.println("\t\t\t ==== IKAN ====");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        //Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Persia";
        kucing.makan = "makanan kucing kemasan";
        kucing.tidur = "Kucing persia tidur pada malam hari";
        Kucing.Mengeong = "Kucing Persia Mengeong saat lapar";

        //Memanggil Method Kucing
        System.out.println("\t\t\t ==== KUCING ==== ");
        kucing.getNama();
        kucing.binatang();
        kucing.mengeong();
    }
}
