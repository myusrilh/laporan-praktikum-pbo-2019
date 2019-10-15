package com.overridingandoverloading.prakjs7smt3;

public class Staff1841720184Yusril extends Karyawan1841720184Yusril {

    private int mlembur;
    private double mgajiLembur;

    public int getmLemburYusril() {
        return mlembur;
    }

    public void setmLemburYusril(int mlembur) {
        this.mlembur = mlembur;
    }

    public double getmGajiLemburYusril() {
        return mgajiLembur;
    }

    public void setmGajiLemburYusril(double mgajiLembur) {
        this.mgajiLembur = mgajiLembur;
    }

    //overloading
    public double getmGaji(int mlembur, double mgajiLembur) {
        return super.getmGajiYusril() + mlembur * mgajiLembur;
    }

    //overriding
    @Override
    public double getmGajiYusril() {
        return super.getmGajiYusril() + mlembur * mgajiLembur;
    }

    public void lihatInfoYusril() {
        System.out.println("NIP         : " + this.getmNipYusril());
        System.out.println("Nama        : " + this.getmNamaYusril());
        System.out.println("Golongan    : " + this.getmGolonganYusril());
        System.out.println("Jml Lembur  : " + this.getmLemburYusril());
        System.out.printf("Gaji Lembur  : %.0f\n", this.getmGajiLemburYusril());
        System.out.printf("Gaji         : %.0f\n", this.getmGajiYusril());
    }
}
