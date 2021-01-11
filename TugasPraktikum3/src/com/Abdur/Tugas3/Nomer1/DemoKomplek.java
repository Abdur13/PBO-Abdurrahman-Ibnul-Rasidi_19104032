package com.Abdur.Tugas3.Nomer1;

public class DemoKomplek {
    public static void main(String[] args) {
        Komplek komplek = new Komplek("002233","Harapan Indah");

        Rumah rumah1 = new Rumah("HI-69","Mukidi",6);
        Rumah rumah2 = new Rumah("HI-56","Maklum",4);
        Rumah rumah3 = new Rumah("HI-45","Marko",3);
        Rumah rumah4 = new Rumah("HI-50","Anduki",2);
        Rumah rumah5 = new Rumah("HI-70","Jomblo",1);

        komplek.addRumah(rumah1.getNamaPemilik());
        komplek.addRumah(rumah2.getNamaPemilik());
        komplek.addRumah(rumah3.getNamaPemilik());
        komplek.addRumah(rumah4.getNamaPemilik());
        komplek.addRumah(rumah5.getNamaPemilik());

        komplek.getDataKomplek();
    }
}
