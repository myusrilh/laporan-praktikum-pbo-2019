package jobsheet2smt3;

public class TestMahasiswa1841720184Yusril {

    public static void main(String[] args) {
        Mahasiswa1841720184Yusril mhs1 = new Mahasiswa1841720184Yusril();
        Mahasiswa1841720184Yusril mhs2 = new Mahasiswa1841720184Yusril();
        Mahasiswa1841720184Yusril mhs3 = new Mahasiswa1841720184Yusril();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodataYusril();
        
        mhs2.nim = 202;
        mhs2.nama = "Hery";
        mhs2.alamat = "Jl. Kumis Kelinci No 2B";
        mhs2.kelas = "2B";
        mhs2.tampilBiodataYusril();
        
        mhs3.nim = 303;
        mhs3.nama = "Saipul";
        mhs3.alamat = "Jl. Kuda Pancal No 3C";
        mhs3.kelas = "3C";
        mhs3.tampilBiodataYusril();
        
    }

}
