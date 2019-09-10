package jobsheet2smt3;

public class Barang1841720184Yusril {

    public String namaBrg;
    public String jenisBrg;
    public int stok;

    public void tampilBarangYusril() {
        System.out.println("Nama Barang    : " + namaBrg);
        System.out.println("Jenis Barang   : " + jenisBrg);
        System.out.println("Stok           : " + stok);
    }

    //method dengan argumen dan nilai balik (return)
    public int tambahStokYusril(int brgMasuk) {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
