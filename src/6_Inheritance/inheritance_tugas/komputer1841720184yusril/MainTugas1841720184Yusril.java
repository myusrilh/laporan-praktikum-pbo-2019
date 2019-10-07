package com.inheritance_tugas.komputer1841720184yusril;

public class MainTugas1841720184Yusril {

    public static void main(String[] args) {
        System.out.println("=========== Windows ============");
        Windows1841720184Yusril jendela = new Windows1841720184Yusril("ASUS X441UB", 2, 4, "intel Core i3", "LiThium", " - HDD 1TB "
                + "\n - Immersive Audio Experience"
                + "\n - 2.3 mm of Key Travel");
        jendela.tampilWindowsYusril();
        System.out.println("============= Mac ==============");
        Mac1841720184Yusril mac = new Mac1841720184Yusril();
        mac.merk = "Macbook Pro 11";
        mac.kecProsesor = 3;
        mac.sizeMemory = 8;
        mac.jnsProsesor = "8th Generation Coffee Lake";
        mac.jnsBatrei = "LiThium";
        mac.security = " - End-to-end encryption"
                + "\n - iCloud";
        mac.tampilMacYusril();
        System.out.println("============= PC ===============");
        PC1841720184Yusril pc = new PC1841720184Yusril();
        pc.merk = "ROG Strix GL12CX";
        pc.kecProsesor = 5;
        pc.sizeMemory = 32;
        pc.jnsProsesor = "9th Gen Intel Core i9-9900K";
        pc.ukuranMonitor = 32;
        pc.tampilPCYusril();
    }

}
