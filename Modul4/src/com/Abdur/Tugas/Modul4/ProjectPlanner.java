package com.Abdur.Tugas.Modul4;

public class ProjectPlanner extends Employe {
    //Method
    public ProjectPlanner(
            String Nama,
            String NIP,
            float Upah,
            float Komisi,
            float TotalPenjualan,
            float TotalProyek
    ){
        //Constructor
        super(Nama,NIP,Upah,Komisi,(float) 0 ,TotalProyek);
    }

    @Override
    public void getGaji() {
        float Pajak = (this.Upah * 5)/100;
        float Gaji = this.Upah + (this.Komisi * this.TotalProyek) - Pajak;
        System.out.println("Total Gaji " + this.Nama + " Adalah " + Gaji);
    }
}
