package com.ramadhanrafli.PBO.pertemuan5;

public class Main {
    public static void main(String[] args) {
        // membuat array kosong
        Barang[] keranjang = new Barang[10];
        //membuat array dengan isinya
        Barang[] etalase = {
                new Barang("indomie",3000),
                new Barang("pulpen",3000),
                new Barang("pensil",2500),
                new Barang("spidol",5000),
                new Barang("penghapus",4000)
        };
        //menampilkan jumlah data dalam array
        System.out.println("Jumlah barang yang ada di etalase :" + etalase.length);

        //menampilkan data yang ada di dalam array
        System.out.println("Daftar barang yang ada dalam etalase : ");

        //perulangan for each untuk menampilkan data yang ada dalam array
        int i = 1;
        for (Barang b : etalase){
            System.out.println("Barang ke-" +i);
            b.showInfo();
            i++;
        }
        for (int j =0;j<etalase.length;j++){
            System.out.println("Barang ke - "+ (j+1));
            etalase[j].showInfo();
        }
    }
}
