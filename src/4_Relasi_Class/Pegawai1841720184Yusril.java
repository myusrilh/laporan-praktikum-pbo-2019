package com.relasiclass.percobaan3;

public class Pegawai1841720184Yusril {

    private String nip;
    private String nama;

    public Pegawai1841720184Yusril(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNipYusril() {
        return nip;
    }

    public void setNipYusril(String nip) {
        this.nip = nip;
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }
    
    public String infoYusril(){
        String info="";
        info +="Nip: "+this.nip+"\n";
        info +="Nama: "+this.nama+"\n";
        return info;
    }    
    
    
}
