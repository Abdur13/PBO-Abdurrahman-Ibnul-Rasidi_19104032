package com.Abdur.Praktikum4.Abstrak;

public class Kucing extends Binatang {
    private String nama;

    public Kucing(String nama){
        super("Kucing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("miawwwww augg");
    }

    @Override
    public String toString() {
        return super.toString()+ " " + nama;
    }
}
