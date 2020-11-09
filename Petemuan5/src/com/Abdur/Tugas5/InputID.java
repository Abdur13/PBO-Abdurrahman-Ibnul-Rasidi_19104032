package com.Abdur.Tugas5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputID {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        //Deklarasi Array dan inisiasi panjang Array
        int[] array = new int[10];
        System.out.println("**** HOTEL KHARISMA ****");
        //Input jumlah pengunjung hotel
        System.out.println("Jumlah Tamu Hotel\t: ");
        int Tamu = scan.nextInt();

        /**
         * Menginputkan maks 10 pengunjung atau tamu hotel
         * Jika menginputkan jumlah pengunjung hotel > 10 maka akan error
         * maka perintah catch "Maksimal jumlah pengunjung 10" akan dijalankan
         */
        //Method intInputMethod

        System.out.println("Masukkan Data Tamu\t: ");
        for (int i=0; i<Tamu;i++){
            try {
                System.out.println("UID\t: ");
                array[i] = intInputMethod();
                System.out.println("Data ke-"+i+" : "+array[i]+"terdaftar");
                //pernyataan disini akan dieksekusi jika terjadi Exception saat jumlah pengunjung lebih
            } catch (InputMismatchException e){
                System.out.println("Inputkan Angka!!!");
                i--;

                //pernyataan disini akan di eksekusi jika terjadi Exception saat jumlah pengunjung lebih
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Maksimal Jumlah Tamu 10!!");
            }
            System.out.println();
            //Lihat data pengunjung tamu hotel
            System.out.println("Lihat data pengunjung\t: ");
            //Input indeks untuk mencari UID pengunjung hotel
            System.out.println("Indeks\t: ");
            int LihatData = scan.nextInt();
            System.out.println("Data ke-"+LihatData+" : "+array[LihatData]);
            //perulangan untuk melihat data indeks lagi
            boolean cek = false;
            do {
                //input jika ingin melihat lagi atau tidak
                System.out.println("Lihat lagi? (y/n)\t: ");
                String lihat = scan.next();
                //Jika milih y maka akan eksekusi program ini
                if (lihat.equals("y") || lihat.equals("Y")){
                    System.out.println("Lihat data pengunjung\t: ");
                    System.out.println("Indeks\t ");
                    LihatData = scan.nextInt();
                    System.out.println("Data ke-" + LihatData + " : "+array[LihatData]);
                    //Jika Tidak
                }else {
                    cek = true;
                }
            }while (!cek);
            //Method intInputMethod
            public static int intInputMethod(){
                Scanner scanner = new Scanner(System.in);
                int Input= scanner.nextInt();
                return Input;

        }

    }
}
