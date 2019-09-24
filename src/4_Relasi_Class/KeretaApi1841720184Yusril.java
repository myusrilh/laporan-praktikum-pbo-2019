package com.relasiclass.percobaan3;

public class KeretaApi1841720184Yusril {

    private String nama;
    private String kelas;
    private Pegawai1841720184Yusril masinis;
    private Pegawai1841720184Yusril asisten;

    public KeretaApi1841720184Yusril(String nama, String kelas, Pegawai1841720184Yusril masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi1841720184Yusril(String nama, String kelas, Pegawai1841720184Yusril masinis, Pegawai1841720184Yusril asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public String getKelasYusril() {
        return kelas;
    }

    public void setKelasYusril(String kelas) {
        this.kelas = kelas;
    }

    public Pegawai1841720184Yusril getMasinisYusril() {
        return masinis;
    }

    public void setMasinisYusril(Pegawai1841720184Yusril masinis) {
        this.masinis = masinis;
    }

    public Pegawai1841720184Yusril getAsistenYusril() {
        return asisten;
    }

    public void setAsistenYusril(Pegawai1841720184Yusril asisten) {
        this.asisten = asisten;
    }

    public String infoYusril() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis + "\n";
        info += "Asisten: " + this.asisten + "\n";
        return info;
    }
}
