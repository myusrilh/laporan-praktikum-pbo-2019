package com.inheritance6.prakjs6smt3;

public class StaffHarian1841720184Yusril extends Staff1841720184Yusril {

    public int jmlJamKerja;

    public StaffHarian1841720184Yusril() {
    }

    public StaffHarian1841720184Yusril(String nama, String alamat, String jk, int umur, int gaji, int potongan, int lembur, int jmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.jmlJamKerja = jmlJamKerja;
    }

    public void tampilStaffHarianYusril() {
        System.out.println("=============Data Staff Tetap==============");
        super.tampilDataStaffYusril();
        System.out.println("Jumlah Jam Kerja    = " + jmlJamKerja);
        System.out.println("Gaji Bersih         = " + (gaji * jmlJamKerja + lembur - potongan));
    }

}
