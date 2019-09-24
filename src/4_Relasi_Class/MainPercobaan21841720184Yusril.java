package com.relasiclass.percobaan2;

public class MainPercobaan21841720184Yusril {

    public static void main(String[] args) {
        Mobil1841720184Yusril m = new Mobil1841720184Yusril();
        m.setMerkYusril("Avanza");
        m.setBiayaYusril(350000);
        Sopir1841720184Yusril s = new Sopir1841720184Yusril();
        s.setNamaYusril("John Doe");
        s.setBiayaYusril(200000);
        Pelanggan1841720184Yusril p = new Pelanggan1841720184Yusril();
        p.setNamaYusril("Jane Doe");
        p.setMobilYusril(m);
        p.setSopirYusril(s);
        p.setHariYusril(2);
        System.out.println("Biaya Total = "+ p.hitungBiayaTotalYusril());
    }

}
