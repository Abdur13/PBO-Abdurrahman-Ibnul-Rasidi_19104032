package com.Abdur.Praktikum3.Komposisi;

public class Monitor {
    private String Merk;
    private String Size;
    private String RefreshRate;

    public Monitor(String Merk,String Size,String RefreshRate){
        this.Merk = Merk;
        this.Size = Size;
        this.RefreshRate = RefreshRate;
    }

    public void PrintSpec(){
        System.out.println("-> Merk\t\t\t: "+Merk);
        System.out.println("-> Size\t\t\t: "+Size);
        System.out.println("-> Refresh Rate\t: "+RefreshRate + "Hz");
        System.out.println();
    }
}
