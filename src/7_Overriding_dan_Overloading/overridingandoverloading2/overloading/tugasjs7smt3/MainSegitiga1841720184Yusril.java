package com.overridingandoverloading2.overloading.tugasjs7smt3;

public class MainSegitiga1841720184Yusril {

    public static void main(String[] args) {
        Segitiga1841720184Yusril triangle1 = new Segitiga1841720184Yusril();

        System.out.println("Total 2 sudut lain segitiga sama sisi: " + triangle1.totalSudutYusril(60));
        System.out.println("========== Segitiga Sembarang Baru ==========");
        System.out.println("sudut A : 45");
        System.out.println("sudut B : 45");
        System.out.println("sudut C: " + triangle1.totalSudutYusril(45, 45));
        System.out.println("=============================================");
        System.out.println("Keliling Segitiga (3 sisi diketahui) : "+triangle1.kelilingYusril(3, 4, 5));
        System.out.println("Keliling Segitiga (2 sisi diketahui) : "+triangle1.kelilingYusril(3,4));
    }

}
