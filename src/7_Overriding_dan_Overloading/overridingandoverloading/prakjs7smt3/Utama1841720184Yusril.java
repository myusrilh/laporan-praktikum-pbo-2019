package com.overridingandoverloading.prakjs7smt3;

public class Utama1841720184Yusril {

    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720184Yusril man[] = new Manager1841720184Yusril[2];
        Staff1841720184Yusril staff1[] = new Staff1841720184Yusril[2];
        Staff1841720184Yusril staff2[] = new Staff1841720184Yusril[3];

        //pembuatan manager
        man[0] = new Manager1841720184Yusril();
        man[0].setmNamaYusril("Tedjo");
        man[0].setmNipYusril("101");
        man[0].setmGolonganYusril("1");
        man[0].setmTunjanganYusril(5000000);
        man[0].setmBagianYusril("Administrasi");

        man[1] = new Manager1841720184Yusril();
        man[1].setmNamaYusril("Atika");
        man[1].setmNipYusril("102");
        man[1].setmGolonganYusril("1");
        man[1].setmTunjanganYusril(2500000);
        man[1].setmBagianYusril("Pemasaran");

        staff1[0] = new Staff1841720184Yusril();
        staff1[0].setmNamaYusril("Usman");
        staff1[0].setmNipYusril("0003");
        staff1[0].setmGolonganYusril("2");
        staff1[0].setmLemburYusril(10);
        staff1[0].setmGajiLemburYusril(10000);

        staff1[1] = new Staff1841720184Yusril();
        staff1[1].setmNamaYusril("Anugrah");
        staff1[1].setmNipYusril("0005");
        staff1[1].setmGolonganYusril("2");
        staff1[1].setmLemburYusril(10);
        staff1[1].setmGajiLemburYusril(55000);
        man[0].setStaffYusril(staff1);

        staff2[0] = new Staff1841720184Yusril();
        staff2[0].setmNamaYusril("Hendra");
        staff2[0].setmNipYusril("0004");
        staff2[0].setmGolonganYusril("3");
        staff2[0].setmLemburYusril(15);
        staff2[0].setmGajiLemburYusril(5500);

        staff2[1] = new Staff1841720184Yusril();
        staff2[1].setmNamaYusril("Arie");
        staff2[1].setmNipYusril("0006");
        staff2[1].setmGolonganYusril("4");
        staff2[1].setmLemburYusril(5);
        staff2[1].setmGajiLemburYusril(100000);

        staff2[1] = new Staff1841720184Yusril();
        staff2[1].setmNamaYusril("Mentari");
        staff2[1].setmNipYusril("0007");
        staff2[1].setmGolonganYusril("3");
        staff2[1].setmLemburYusril(6);
        staff2[1].setmGajiLemburYusril(20000);
        man[1].setStaffYusril(staff2);

        //cetak informasi dari manager + staffnya
        man[0].lihatInfoYusril();
        man[1].lihatInfoYusril();
    }

}
