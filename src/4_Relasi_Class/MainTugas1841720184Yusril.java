package com.relasiclass.tugasjs4smt3;

public class MainTugas1841720184Yusril {

    public static void main(String[] args) {
        System.out.println("===== Rumah Sakit Kasih Ayah =====");
        System.out.println();
        Obat1841720184Yusril o = new Obat1841720184Yusril("Toxic", "Racun");
        Pasien1841720184Yusril p = new Pasien1841720184Yusril(o, 1234, "Jono", 19, "Jl. Mawar 2233", "Keracunan");
        Dokter1841720184Yusril d = new Dokter1841720184Yusril(p, "dr. Freya Subandono", 9919);
        RumahSakit1841720184Yusril rs = new RumahSakit1841720184Yusril(d, "Bougenville", 456);
        rs.infoRumahSakitYusril();
    }

}
