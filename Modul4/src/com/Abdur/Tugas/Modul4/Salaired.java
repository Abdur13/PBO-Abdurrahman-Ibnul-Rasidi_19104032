package com.Abdur.Tugas.Modul4;

public class Salaired extends Employe {
    //Method
    public  Salaired(
            String Nama,String NIP,float Upah,float Komisi,float TotalPenjualan,float TotalProyek
    ){
        super(Nama,NIP,Upah,(float)0,(float)0,(float)0);
    }
    //Override Method

    @Override
    public void getGaji() {
        System.out.println("Total Gaji " + this.Nama + " Adalah " + this.Upah);
    }
}
