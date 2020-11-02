package com.Abdur.Tugas3.Nomer3;

import java.util.ArrayList;

public class DemoKeluarga {
    public static void main(String[] args) {
        Keluarga keluarga = new Keluarga("Keluarga Buah","Kebon Sari");

        ArrayList<Anak> anakArrayList = new ArrayList<>();

        keluarga.addAnggotaKeluarga(new Ayah(01,"Papa Jeruk",35),
                new Ibu(02,"Mama Lemon",30),anakArrayList);

        anakArrayList.add(new Anak(03,"Jeruk Nipis",10,"Anak Kandung"));
        anakArrayList.add(new Anak(04,"Jeruk Pungut",5,"Anak Pungut"));

        keluarga.getDatakeluarga();
    }
}
