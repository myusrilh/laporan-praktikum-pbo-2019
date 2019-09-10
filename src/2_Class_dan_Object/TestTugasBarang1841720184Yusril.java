package jobsheet2smt3;

/**
 *
 * @author asus
 */
public class TestTugasBarang1841720184Yusril {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TugasBarang1841720184Yusril brg1 = new TugasBarang1841720184Yusril();

        brg1.kode = "007";
        brg1.namaBarang = "Kardus";
        brg1.hargaDasar = 5000;
        brg1.diskon = (float) 0.25;
        brg1.hitungHargaJualYusril();
        brg1.tampilDataYusril();
    }

}
