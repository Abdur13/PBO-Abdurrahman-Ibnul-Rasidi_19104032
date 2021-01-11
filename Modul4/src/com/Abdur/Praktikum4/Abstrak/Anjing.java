package com.Abdur.Praktikum4.Abstrak;

public class Anjing extends Binatang {
    private String nama;

    public Anjing(String nama){
        super("Anjing");
        this.nama = nama;
    }

    @Override
    protected void suara() {
        System.out.println("Aku ga bisa kalo harus ninggalin kamu");
    }

    @Override
    public String toString() {
        return super.toString()+ " " + nama;
    }
}
