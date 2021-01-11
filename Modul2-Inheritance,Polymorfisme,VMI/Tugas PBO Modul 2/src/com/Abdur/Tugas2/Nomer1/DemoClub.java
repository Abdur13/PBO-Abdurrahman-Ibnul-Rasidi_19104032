package com.Abdur.Tugas2.Nomer1;

public class DemoClub {
    public static void main(String[] args) {

        //Objek Club
        Club club1 = new Club();
        Club club2 = new Club("Liverpool");
        Club club3 = new Club("Liverpool","Liverpool adalah Sebuah club Sepak Bola yang berasal dari Liga Inggris");
        Club club4 = new Club("Liverpool",1892,"Anfield");
        Club club5 = new Club("Liverpool",1892,"Anfield",6,"Liverpool Football Club Adalah sebuah klub sepak bola dari liga Inggris");

        //Memanggil Method dari Class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
