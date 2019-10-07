package com.inheritance_tugas.komputer1841720184yusril;

public class Komputer1841720184Yusril {

    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer1841720184Yusril() {
    }

    public Komputer1841720184Yusril(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilDataYusril() {
        System.out.println("Merk                = " + merk);
        System.out.println("Kecepatan Processor = " + kecProsesor + " GHZ");
        System.out.println("Ukuran Memory       = " + sizeMemory + " GB");
        System.out.println("Jenis Processor     = " + jnsProsesor);
    }

}
