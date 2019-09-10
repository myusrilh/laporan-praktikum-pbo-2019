package jobsheet2smt3;

public class TestBarang1841720184Yusril {

    public static void main(String[] args) {
        Barang1841720184Yusril brg1 = new Barang1841720184Yusril();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangYusril();

        // menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah " + brg1.tambahStokYusril(20));
    }

}
