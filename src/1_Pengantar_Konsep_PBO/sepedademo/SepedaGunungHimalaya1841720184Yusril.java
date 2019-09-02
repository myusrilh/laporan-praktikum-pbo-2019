package sepedademo;

public class SepedaGunungHimalaya1841720184Yusril extends SepedaGunung1841720184Yusril {

    private String jenis;

    public void jenisSepedaYusril(String newValue) {
        jenis = newValue;
    }

    public void cetakStatusYusril() {
        super.cetakStatusYusril();
        System.out.println("Jenis Sepeda: " + jenis);
    }
}
