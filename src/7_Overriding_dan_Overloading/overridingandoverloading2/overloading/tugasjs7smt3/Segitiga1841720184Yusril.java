package com.overridingandoverloading2.overloading.tugasjs7smt3;

public class Segitiga1841720184Yusril {

    private int sudut;

    public int totalSudutYusril(int sudutA) {
        return (180 - sudutA);
    }

    public int totalSudutYusril(int sudutA, int sudutB) {
        return (180 - (sudutA + sudutB));
    }

    public int kelilingYusril(int sisiA, int sisiB, int sisiC) {
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }
    
    public double kelilingYusril(int sisiA, int sisiB){
        double squareroot;
        double gt;
        
        int angka = (sisiA*sisiA)+(sisiB*sisiB);
        squareroot = angka/2;
        do{
            gt = squareroot;
            squareroot = (gt + (angka/gt))/2;
        }while((gt-squareroot)!=0);
        return squareroot+sisiA+sisiB;
        
//        double sisiC = Math.sqrt(Math.pow(sisiA,2) + Math.pow(sisiB,2));
//        double keliling = sisiA + sisiB + sisiC;
//        return keliling;
    }
}
