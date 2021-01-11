package com.Abdur.Tugas3.Nomer3;

public class Anak {
    private int IDAnak,UmurAnak;
    private String NamaAnak,StatusAnak;

    public Anak(int idAnak,String namaAnak,int umurAnak,String statusAnak){
        this.IDAnak = idAnak;
        this.NamaAnak = namaAnak;
        this.UmurAnak = umurAnak;
        this.StatusAnak = statusAnak;
    }

    public int getIDAnak() {
        return IDAnak;
    }

    public String getNamaAnak() {
        return NamaAnak;
    }

    public int getUmurAnak() {
        return UmurAnak;
    }

    public String getStatusAnak() {
        return StatusAnak;
    }
}
