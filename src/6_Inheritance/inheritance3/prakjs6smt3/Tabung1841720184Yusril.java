package com.inheritance3.prakjs6smt3;

public class Tabung1841720184Yusril extends Bangun1841720184Yusril {

    protected int t;

    public void setSuperPhiYusril(double phi) {
        super.phi = phi;
    }

    public void setSuperRYusril(int r) {
        super.r = r;
    }

    public void setTYusril(int t) {
        this.t = t;
    }

    public void VolumeYusril() {
        System.out.println("Volume Tabung adalah: " + (super.phi * super.r * this.t));
    }
}
