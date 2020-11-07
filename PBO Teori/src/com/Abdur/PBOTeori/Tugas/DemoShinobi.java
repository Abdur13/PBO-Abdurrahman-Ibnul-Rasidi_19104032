package com.Abdur.PBOTeori.Tugas;

public class DemoShinobi {
    public static void main(String[] args) {
        Shinobi[] n = new Shinobi[3];

        //Objek 1
        n[0] = new Shinobi();
        n[0].setNoRegis("012606");
        n[0].setNama("Uchiha Sasuke");
        n[0].setPeringkat("Genin");
        //Objek 2
        n[1] = new Shinobi();
        n[1].setNoRegis("012607");
        n[1].setNama("Uzumaki Naruto");
        n[1].setPeringkat("Genin");
        //Objek 3
        n[2] = new Shinobi();
        n[2].setNoRegis("012601");
        n[2].setNama("Haruno Sakura");
        n[2].setPeringkat("Chunin");

        //output 3 Objek Array
        System.out.println("Data Shinobi Konoha Gakure\n");
        for (Shinobi i:n){
            System.out.println("Nomer Registrasi : " +i.getNoRegis());
            System.out.println("Nama\t\t : "+ i.getNama());
            System.out.println("Peringkat Ninja  : "+ i.getPeringkat());
            System.out.println();
        }
    }
}
