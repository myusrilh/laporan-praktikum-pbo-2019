package com.inheritance5.prakjs6smt3;

public class Staff1841720184Yusril extends Karyawan1841720184Yusril {

    public int lembur, potongan;

    public Staff1841720184Yusril() {
    }

    public Staff1841720184Yusril(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
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
