package com.overridingandoverloading.prakjs7smt3;

public class Karyawan1841720184Yusril {

    private String mnama;
    private String mnip;
    private String mgolongan;
    private double mgaji;

    public String getmNamaYusril() {
        return mnama;
    }

    public void setmNamaYusril(String mnama) {
        this.mnama = mnama;
    }

    public String getmNipYusril() {
        return mnip;
    }

    public void setmNipYusril(String mnip) {
        this.mnip = mnip;
    }

    public String getmGolonganYusril() {
        return mgolongan;
    }

    public void setmGolonganYusril(String mgolongan) {
        this.mgolongan = mgolongan;

        switch (mgolongan.charAt(0)) {
            case '1':
                this.mgaji = 5000000;
                break;
            case '2':
                this.mgaji = 3000000;
                break;
            case '3':
                this.mgaji = 2000000;
                break;
            case '4':
                this.mgaji = 1000000;
                break;
            case '5':
                this.mgaji = 750000;
                break;
        }

    }

    public double getmGajiYusril() {
        return mgaji;
    }

    public void setmGajiYusril(double mgaji) {
        this.mgaji = mgaji;
    }

}
