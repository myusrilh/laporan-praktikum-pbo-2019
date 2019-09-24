package com.relasiclass.tugasjs4smt3;

public class Pasien1841720184Yusril {

    private int id;
    private String nama;
    private int umur;
    private String alamat;
    private Obat1841720184Yusril obat;
    private String penyakit;

    public Pasien1841720184Yusril() {
    }

    public Pasien1841720184Yusril(Obat1841720184Yusril obat, int id, String nama, int umur, String alamat, String penyakit) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.penyakit = penyakit;
        this.obat = obat;
    }

    public int getIdYusril() {
        return id;
    }

    public void setIdYusril(int id) {
        this.id = id;
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public int getUmurYusril() {
        return umur;
    }

    public void setUmurYusril(int umur) {
        this.umur = umur;
    }

    public String getAlamatYusril() {
        return alamat;
    }

    public void setAlamatYusril(String alamat) {
        this.alamat = alamat;
    }

    public void infoYusril() {
        System.out.println("ID       : " + id);
        System.out.println("Nama     : " + nama);
        System.out.println("Umur     : " + umur + " tahun");
        System.out.println("Alamat   : " + alamat);
        System.out.println("Penyakit : " + penyakit);
        System.out.println();
        System.out.print("Obat yang dibutuhkan: \n");
        obat.infoObatYusril();
    }

}
