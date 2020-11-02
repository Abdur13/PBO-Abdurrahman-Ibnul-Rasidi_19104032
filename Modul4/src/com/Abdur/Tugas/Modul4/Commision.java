package com.Abdur.Tugas.Modul4;

public class Commision extends Employe {
    //Method
    public Commision(
            String Nama,String NIP,float Upah, float Komisi,float TotalPenjualan,float TotalProyek
    ){
        //Constructor
        super(Nama,NIP,Upah,Komisi,TotalPenjualan,TotalProyek);
    }

    @Override
    public void getGaji() {
        float Gaji = this.Upah + (this.Komisi * this.TotalPenjualan);
        System.out.println("Total Gaji " + this.Nama + " Adalah " + Gaji);
    }
}
