package com.relasiclass.percobaan2;

public class Sopir1841720184Yusril {

    private String nama;
    private int biaya;

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public int getBiayaYusril() {
        return biaya;
    }

    public void setBiayaYusril(int biaya) {
        this.biaya = biaya;
    }

    
    public int hitungBiayaSopirYusril(int hari) {
        return biaya * hari;
    }

}
