package com.Abdur.Praktikum4.Abstrak;

public abstract class Binatang {
    private String jenis;

    public Binatang(String jenis){this.jenis = jenis;}

    protected abstract void suara();

    @Override
    public String toString() {
        return "Seekor " + jenis;
    }
}
