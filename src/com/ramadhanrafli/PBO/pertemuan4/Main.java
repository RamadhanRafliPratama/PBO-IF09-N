package com.ramadhanrafli.PBO.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        Pegawai pegawai = new Pegawai();

        manajer.nip = 18190024;
        manajer.nama = "Basuki";

        pegawai.nip = 191220032;
        pegawai.nama = "Ahmad";

        manajer.showInfo();
        manajer.exrtraInfo();
        manajer.bonus(1000000);
        manajer.bonus();

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
