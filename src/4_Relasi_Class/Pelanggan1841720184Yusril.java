package com.relasiclass.percobaan2;

class Pelanggan1841720184Yusril {

    private String nama;
    private Mobil1841720184Yusril mobil;
    private Sopir1841720184Yusril sopir;
    private int hari;

    public Pelanggan1841720184Yusril() {
        
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public Mobil1841720184Yusril getMobil() {
        return mobil;
    }

    public void setMobilYusril(Mobil1841720184Yusril mobil) {
        this.mobil = mobil;
    }

    public Sopir1841720184Yusril getSopir() {
        return sopir;
    }

    public void setSopirYusril(Sopir1841720184Yusril sopir) {
        this.sopir = sopir;
    }

    public int getHariYusril() {
        return hari;
    }

    public void setHariYusril(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotalYusril(){
        return mobil.hitungBiayaMobilYusril(hari) + 
        sopir.hitungBiayaSopirYusril(hari);
    }

}
