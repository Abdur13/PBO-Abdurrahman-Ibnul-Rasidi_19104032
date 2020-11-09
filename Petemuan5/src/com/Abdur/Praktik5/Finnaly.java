package com.Abdur.Praktik5;

public class Finnaly {
    public static void main(String[] args) {
        int [] array = new int[5];
        try {
            //Database di open
            System.out.println("Akses Elemen ke-5\t: "+array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //Exception
            System.out.println("Ada Exeption Array");
        }finally {
            //database di tutup
            array[array.length -1]=10;
            System.out.println("Nilai Elemen Terakhir\t: " +array[array.length-1]);
        }
    }
}
