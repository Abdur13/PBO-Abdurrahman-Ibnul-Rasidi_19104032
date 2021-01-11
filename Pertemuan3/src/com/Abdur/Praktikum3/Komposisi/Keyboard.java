package com.Abdur.Praktikum3.Komposisi;

public class Keyboard {
    private String Merk;
    private String Type;

    public Keyboard(String Merk,String Type){
        this.Merk = Merk;
        this.Type = Type;
    }
    public void PrintSpec(){
        System.out.println("-> Merk\t : "+Merk);
        System.out.println("-> Type\t : "+Type);
        System.out.println();
    }
}
