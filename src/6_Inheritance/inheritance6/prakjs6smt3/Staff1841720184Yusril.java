package com.inheritance6.prakjs6smt3;

public class Staff1841720184Yusril extends Karyawan1841720184Yusril {

    public int lembur, potongan;

    public Staff1841720184Yusril() {
    }

    public Staff1841720184Yusril(String nama, String alamat, String jk, int umur, int gaji, int potongan, int lembur) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }

    public void tampilDataStaffYusril() {
        super.tampilDataKaryawanYusril();
        System.out.println("Lembur          = " + lembur);
        System.out.println("Potongan        = " + potongan);
        System.out.println("Total Gaji      = " + (gaji + lembur + potongan));
    }

}
