package com.relasiclass.percobaan4;

public class Gerbong1841720184Yusril {

    private String kode;
    private Kursi1841720184Yusril[] arrayKursi;

    public Gerbong1841720184Yusril(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi1841720184Yusril[jumlah];
        this.initKursiYusril();
    }

    public String getKodeYusril() {
        return kode;
    }

    public void setKodeYusril(String kode) {
        this.kode = kode;
    }

    public Kursi1841720184Yusril[] getArrayKursiYusril() {
        return arrayKursi;
    }

    public void setPenumpang(Penumpang1841720184Yusril penumpang, int nomor) {
        this.arrayKursi[nomor - 1].setPenumpangYusril(penumpang);
    }

    private void initKursiYusril() {
        for (int i = 0; i < arrayKursi.length; i++) {
            arrayKursi[i] = new Kursi1841720184Yusril(String.valueOf(i + 1));
        }
    }

    public String infoYusril() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi1841720184Yusril kursi : arrayKursi) {
            info += kursi.infoYusril();
        }
        return info;
    }
}
