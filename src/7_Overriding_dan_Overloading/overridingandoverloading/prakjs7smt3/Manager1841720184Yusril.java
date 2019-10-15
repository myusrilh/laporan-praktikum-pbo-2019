package com.overridingandoverloading.prakjs7smt3;

public class Manager1841720184Yusril extends Karyawan1841720184Yusril {

    private double mtunjangan;
    private String mbagian;
    private Staff1841720184Yusril[] mst;

    public double getmTunjanganYusril() {
        return mtunjangan;
    }

    public void setmTunjanganYusril(double mtunjangan) {
        this.mtunjangan = mtunjangan;
    }

    public String getmBagianYusril() {
        return mbagian;
    }

    public void setmBagianYusril(String mbagian) {
        this.mbagian = mbagian;
    }

    public void setStaffYusril(Staff1841720184Yusril[] mst) {
        this.mst = mst;
    }

    public void viewStaffYusril() {
        int i = 0;
        System.out.println("==================");
        for (Staff1841720184Yusril staff1841720184Yusril : mst) {
            mst[i].lihatInfoYusril();
        }
        System.out.println("==================");
    }

    public void lihatInfoYusril() {
        System.out.println("Manager     : " + this.getmBagianYusril());
        System.out.println("NIP         : " + this.getmNipYusril());
        System.out.println("Nama        : " + this.getmNamaYusril());
        System.out.println("Golongan    : " + this.getmGolonganYusril());
        System.out.printf("Tunjangan   : %.0f\n", this.getmTunjanganYusril());
        System.out.printf("Gaji        : %.0f\n", this.getmGajiYusril());
        System.out.println("Bagian      : " + this.getmBagianYusril());
        this.viewStaffYusril();
    }
    
    @Override
    public double getmGajiYusril() {
        return super.getmGajiYusril() + mtunjangan;
    }

}
