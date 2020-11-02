package com.Abdur.Praktikum4.Interface;

public class Paket extends Buku implements interfaceCD{
    long hargaPaket;
    interfaceCD InterfaceCD;

    public Paket(String judul,String Pengarang,long hargaBuku,String ukuran,long hargaCD){
        super(judul,Pengarang,hargaBuku);
        InterfaceCD = new ChildCD(ukuran,hargaCD);
    }
    public void hitungHargaPaket(){hargaPaket = super.hargaBuku + getHargaCD();}

    @Override
    public long getHargaCD() {
        return (InterfaceCD.getHarga());
    }

    @Override
    public long cetakCD(){return (InterfaceCD.cetakCD();)}

    @Override
    public void CetakPaket() {
        super.CetakBuku();
        cetakCD();
        System.out.println("Harga Paket Buku dan CD : Rp " + hargaPaket + "\n");
    }
}

