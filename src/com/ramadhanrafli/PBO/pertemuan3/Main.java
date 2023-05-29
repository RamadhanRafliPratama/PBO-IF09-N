package com.ramadhanrafli.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        //pembuatan class
        SepedaMotor honda = new SepedaMotor("honda","vario 160",27000000);
        SepedaMotor yamaha = new SepedaMotor("yamaha","aerox",33000000);
        SepedaMotor vespa  = new SepedaMotor("vespa","vespa matic",40000000);

   //menjalankan method showInfo
        honda.showInfo();
        yamaha.showInfo();
        vespa.showInfo();

        //uji coba getter dan setter
        System.out.println("motor merk " + honda.getMerk() + " dengan tipe (sebelum) : " + honda.getTipe());
        honda.setTipe("Beat 110");
        System.out.println("motor merk " + honda.getMerk() + " dengan tipe (sesudah) : " + honda.getTipe());
    }
}
