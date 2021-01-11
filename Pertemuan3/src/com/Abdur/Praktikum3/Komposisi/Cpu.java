package com.Abdur.Praktikum3.Komposisi;

public class Cpu {
    private String Processor;
    private String Gpu;
    private String Ram;

    public Cpu(String Processor,String Gpu,String Ram){
        this.Processor = Processor;
        this.Gpu = Gpu;
        this.Ram = Ram;
    }
    public void PrintSpec(){
        System.out.println("-> Processor\t : "+Processor);
        System.out.println("-> GPU\t\t : "+Gpu);
        System.out.println("-> RAM\t\t : "+Ram);
        System.out.println();
    }
}
