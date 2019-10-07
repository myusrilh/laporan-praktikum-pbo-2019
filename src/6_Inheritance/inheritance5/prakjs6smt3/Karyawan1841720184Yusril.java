package com.inheritance5.prakjs6smt3;

public class Karyawan1841720184Yusril {

    public String nama, alamat, jk;
    public int umur, gaji;

    public Karyawan1841720184Yusril() {
    }

    public Karyawan1841720184Yusril(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilDataKaryawanYusril() {
        System.out.println("Nama            = " + nama);
        System.out.println("Alamat          = " + alamat);
        System.out.println("Jenis Kelamin   = " + jk);
        System.out.println("Umur            = " + umur);
        System.out.println("Gaji            = " + gaji);
    }

}
