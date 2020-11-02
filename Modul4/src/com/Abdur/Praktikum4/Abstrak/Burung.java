package com.Abdur.Praktikum4.Abstrak;

public class Burung extends Binatang {
    private String nama;

    public Burung(String nama){
        super("Burung");
        this.nama = nama;
    }
    protected void suara(){
        System.out.println("Berkicau tetet toet");
    }

    @Override
    public String toString() {
        return super.toString() + " " +nama;
    }
}
