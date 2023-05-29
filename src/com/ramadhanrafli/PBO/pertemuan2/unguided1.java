package com.ramadhanrafli.PBO.pertemuan2;

import java.util.Scanner;

public class unguided1 {
    public static void main(String[] args) {
        // Username dan password yang benar
        String usernameBenar = "rafli";
        String passwordBenar = "21102271";

        // Menerima input username dan password
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Mengecek apakah username dan password sudah diisi
        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Silakan login dengan username dan password yang sah!");
        }
        // Mengecek apakah username dan password benar
        else if (username.equals(usernameBenar) && password.equals(passwordBenar)) {
            System.out.println("Login berhasil silakan masuk");
        }
        else {
            System.out.println("Username dan password Anda salah");
        }
    }
}
