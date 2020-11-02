package com.Abdur.Praktikum4.Abstrak;

public class Kambing extends Binatang{
    private String nama;

    public Kambing(String nama){
        super("Kambing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("mbeeeeelelelele");
    }

    @Override
    public String toString() {
        return super.toString() + " " + nama;
    }
}
