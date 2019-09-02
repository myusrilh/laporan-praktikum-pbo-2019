package tugasjs1smt3;
public class Wisata1841720184Yusril {

    private int harga;
    private String jenis;
    
    public void jenisWisataYusril(String newValue) {
        jenis = newValue;
    }

    public void htmWisataYusril(int newValue) {
        harga = newValue;
    }

    public void cetakStrukYusril() {
        System.out.println("==== TIKET MASUK WISATA ====");
        System.out.println("Jenis Wisata: " + jenis);
        System.out.println("Harga Tiket Masuk: Rp. " + harga);
    }
}
