package tugasjs1smt3;

public class Gunung1841720184Yusril extends Wisata1841720184Yusril {
    private String nama;

    public void namaGunungYusril(String newValue) {
        nama = newValue;
    }

    public void cetakStrukYusril() {
        super.cetakStrukYusril();
        System.out.println("Nama Gunung: " + nama);
        System.out.println("============================");
    }
}
