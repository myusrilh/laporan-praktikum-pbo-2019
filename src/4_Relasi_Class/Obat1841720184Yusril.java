package com.relasiclass.tugasjs4smt3;

public class Obat1841720184Yusril {

    private String nama;
    private String jenis;

    public Obat1841720184Yusril(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    public Obat1841720184Yusril() {
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public String getJenisYusril() {
        return jenis;
    }

    public void setJenisYusril(String jenis) {
        this.jenis = jenis;
    }

    public void infoObatYusril() {
        System.out.println("Nama  : " + nama);
        System.out.println("Jenis : " + jenis);
    }

}
