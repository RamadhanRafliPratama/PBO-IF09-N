package com.ramadhanrafli.PBO.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static int BagiBilangan(int bilangan1, int bilangan2) {
        return bilangan1 / bilangan2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan pertama: ");
            int bilangan1 = input.nextInt();

            System.out.print("Masukkan bilangan kedua: ");
            int bilangan2 = input.nextInt();

            int hasil = BagiBilangan(bilangan1, bilangan2);
            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan : Pembagian dengan nol tidak diperbolehkan.");
        } catch (InputMismatchException e) {
            System.out.println("Terjadi kealahan : Input tidak valid harap masukkan bilangan bulat.");
        }
    }
}

