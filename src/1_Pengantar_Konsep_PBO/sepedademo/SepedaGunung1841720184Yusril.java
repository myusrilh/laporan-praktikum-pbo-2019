package sepedademo;

public class SepedaGunung1841720184Yusril extends Sepeda1841720184Yusril {

    private String tipeSuspensi;
    private String warna;

    public void setTipeSuspensiYusril(String newValue) {
        tipeSuspensi = newValue;
    }

    public void warnaYusril(String newValue) {
        warna = newValue;
        super.warnaYusril(warna);
    }

    public void cetakStatusYusril() {
        super.cetakStatusYusril();
        System.out.println("Tipe Suspensi: " + tipeSuspensi);
    }
}
