package com.inheritance6.prakjs6smt3;

public class StaffTetap1841720184Yusril extends Staff1841720184Yusril {

    public String golongan;
    public int asuransi;

    public StaffTetap1841720184Yusril() {
    }

    public StaffTetap1841720184Yusril(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetapYusril() {
        System.out.println("=============Data Staff Tetap==============");
        super.tampilDataStaffYusril();
        System.out.println("Golongan            = " + golongan);
        System.out.println("Jumlah Asuransi     = " + asuransi);
        System.out.println("Gaji Bersih         = " + (gaji + lembur - potongan - asuransi));
    }

}
