package com.Abdur.Tugas3.Nomer2;

import java.util.ArrayList;
import java.util.List;

public class TataSurya {
    private String ID;
    private String Nama;

    private List<Planet> planetList = new ArrayList<>();

    public TataSurya(String ID,String Nama){
        this.ID = ID;
        this.Nama = Nama;
    }
    public int getTotalMember(){return getPlanets().size();}

    public List<Planet> getPlanets() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }

    public String getID() {
        return ID;
    }

    public String getNama() {
        return Nama;
    }
    public void getData(){
        System.out.println("ID Tata Surya\t\t: " + getID());
        System.out.println("Nama Tata Surya\t: " +getNama());
        System.out.println("Total Member\t\t: "+getTotalMember());
        System.out.println();
        for (Planet planet:planetList){
            System.out.println("-> ID Planet\t: "+planet.getIDPlanet()+
                    "\t -> Urutan Planet\t: " +planet.getUrutanPlanet()+
                    "\t -> Nama Planet\t : "+planet.getNamaPlanet());
        }
    }
}
