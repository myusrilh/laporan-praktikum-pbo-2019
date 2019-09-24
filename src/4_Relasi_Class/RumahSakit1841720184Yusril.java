package com.relasiclass.tugasjs4smt3;

/**
 *
 * @author asus
 */
public class RumahSakit1841720184Yusril {

    private String nama;
    private int nomor;
    private Dokter1841720184Yusril dokter;

    public RumahSakit1841720184Yusril() {
    }

    public RumahSakit1841720184Yusril(Dokter1841720184Yusril dokter, String nama, int nomor) {
        this.nama = nama;
        this.nomor = nomor;
        this.dokter = dokter;
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public int getNomorYusril() {
        return nomor;
    }

    public void setNomorYusril(int nomor) {
        this.nomor = nomor;
    }

    public void infoRumahSakitYusril() {
        System.out.println("Nama Ruangan: " + nama);
        System.out.println("Nomor Ruangan: " + nomor);
        System.out.println();
        System.out.println("Dokter yang menangani: ");
        dokter.infoDokterYusril();

    }

}
