package com.relasiclass.percobaan4;

public class Kursi1841720184Yusril {

    private String nomor;
    private Penumpang1841720184Yusril penumpang;

    public Kursi1841720184Yusril(String nomor) {
        this.nomor = nomor;
    }

    public String getNomorYusril() {
        return nomor;
    }

    public void setNomorYusril(String nomor) {
        this.nomor = nomor;
    }

    public Penumpang1841720184Yusril getPenumpangYusril() {
        return penumpang;
    }

    public void setPenumpangYusril(Penumpang1841720184Yusril penumpang) {
        this.penumpang = penumpang;
    }

    public String infoYusril() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: "+ penumpang.infoYusril() +"\n";
        }
        return info;
    }

}
