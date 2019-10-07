package com.inheritance5.prakjs6smt3;

public class Manager1841720184Yusril extends Karyawan1841720184Yusril {

    public int tunjangan;

    public Manager1841720184Yusril() {

    }

    public void tampilDataManagerYusril() {
        super.tampilDataKaryawanYusril();
        System.out.println("Tunjangan       = " + tunjangan);
        System.out.println("Total Gaji      = " + (super.gaji+tunjangan));
    }

}
