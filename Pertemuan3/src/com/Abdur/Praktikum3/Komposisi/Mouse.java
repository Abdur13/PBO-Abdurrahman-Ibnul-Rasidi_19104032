package com.Abdur.Praktikum3.Komposisi;

public class Mouse {
    public String Merk;
    public String Dpi;

    public Mouse(String Merk, String Dpi){
        this.Merk = Merk;
        this.Dpi = Dpi;
    }
    public void PrintSpec(){
        System.out.println("-> Merk\t: " + Merk);
        System.out.println("-> DPI\t : " + Dpi);
        System.out.println();
    }
}
