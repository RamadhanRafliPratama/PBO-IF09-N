package com.ramadhanrafli.PBO.pertemuan2;

import java.util.Scanner;

public class Unguided2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input nama
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();

        // input gaji
        System.out.print("Masukkan gaji Anda: ");
        long gaji = input.nextLong();

        // input tunjangan
        System.out.print("Masukkan tunjangan Anda: ");
        long tunjangan = input.nextLong();

        // hitung gaji kotor
        long gajiKotor = gaji + tunjangan;

        // hitung pajak
        double pajak = 0.0765;
        long pajakNegara = (long) (gajiKotor * pajak);

        // hitung gaji bersih
        long gajiBersih = gajiKotor - pajakNegara;

        // tampilkan hasil
        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");
        System.out.println("Gaji: " + gaji);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Pajak: 7.65%");
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Pajak Negara: " + pajakNegara);
        System.out.println("Gaji Bersih: " + gajiBersih);
        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gajiBersih + ".");
    }
}
