package com.relasiclass.tugasjs4smt3;

public class Dokter1841720184Yusril {

    private String nama;
    private int nip;
    private Pasien1841720184Yusril pasien;

    public Dokter1841720184Yusril() {
    }

    public Dokter1841720184Yusril(Pasien1841720184Yusril pasien,String nama, int nip) {
        this.nama = nama;
        this.nip = nip;
        this.pasien = pasien;
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public int getNipYusril() {
        return nip;
    }

    public void setNipYusril(int nip) {
        this.nip = nip;
    }
    
    public void infoDokterYusril(){
        System.out.println("Nama    : "+nama);
        System.out.println("NIP     : "+nip);
        System.out.println();
        System.out.println("Pasien yang ditangani: ");
        pasien.infoYusril();
        
    }
}
