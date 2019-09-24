package com.relasiclass.percobaan2;

public class Mobil1841720184Yusril {

    private String merk;
    private int biaya;
    
    Mobil1841720184Yusril(){
        
    }

    public String getMerkYusril() {
        return merk;
    }

    public void setMerkYusril(String merk) {
        this.merk = merk;
    }

    public int getBiayaYusril() {
        return biaya;
    }

    public void setBiayaYusril(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobilYusril(int hari){
        return biaya * hari;
    }
    
}
