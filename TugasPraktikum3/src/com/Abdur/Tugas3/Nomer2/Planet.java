package com.Abdur.Tugas3.Nomer2;

public class Planet {
    private int IDPlanet;
    private int UrutanPlanet;
    private String NamaPlanet;

    public Planet(int IDPlanet,int UrutanPlanet,String NamaPlanet){
        this.IDPlanet = IDPlanet;
        this.UrutanPlanet = UrutanPlanet;
        this.NamaPlanet = NamaPlanet;
    }

    public void setIDPlanet(int IDPlanet) {
        this.IDPlanet = IDPlanet;
    }

    public void setUrutanPlanet(int urutanPlanet) {
        UrutanPlanet = urutanPlanet;
    }

    public void setNamaPlanet(String namaPlanet) {
        NamaPlanet = namaPlanet;
    }

    public int getIDPlanet() {
        return IDPlanet;
    }

    public int getUrutanPlanet() {
        return UrutanPlanet;
    }

    public String getNamaPlanet() {
        return NamaPlanet;
    }
}
