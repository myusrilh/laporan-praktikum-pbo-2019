package com.relasiclass.percobaan4;

public class Penumpang1841720184Yusril {

    private String ktp;
    private String nama;

    public Penumpang1841720184Yusril(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public String getKtpYusril() {
        return ktp;
    }

    public void setKtpYusril(String ktp) {
        this.ktp = ktp;
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public String infoYusril() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }

}
