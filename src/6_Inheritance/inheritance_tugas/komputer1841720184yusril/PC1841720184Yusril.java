package com.inheritance_tugas.komputer1841720184yusril;

public class PC1841720184Yusril extends Komputer1841720184Yusril {

    public int ukuranMonitor;

    public PC1841720184Yusril() {
    }

    public PC1841720184Yusril(String merk, int kecProcessor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProcessor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }

    public void tampilPCYusril() {
        super.tampilDataYusril();
        System.out.println("Ukuran Monitor      = " + ukuranMonitor +" inch");
    }

}
