package com.ramadhanrafli.PBO.pertemuan3;

import java.security.PrivateKey;

public class SepedaMotor {
    //atributs
   private  String merk;
   private String tipe;
   private int harga;

    //constructor

    public SepedaMotor(String merk,String tipe,int harga){
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
    }
    //method
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getTipe(){
        return tipe;
    }
    public void setTipe(String tipe){
        this.tipe =  tipe;
    }
    public int getHarga(int harga){
        return harga;
    }

    public void setHarga(){
        this.harga = harga;
    }
    public void showInfo(){
        System.out.println("merk : " + merk);
        System.out.println("tipe : " + tipe);
        System.out.println("harga :" + harga);
        System.out.println();
    }
}
