package pbominggu9.abstractclass;

public class Orang1841720184Yusril {

    private String nama;
    private Hewan1841720184Yusril hewanPeliharaan;

    public Orang1841720184Yusril(String nama) {
        this.nama = nama;
    }

    public void peliharaanHewanYusril(Hewan1841720184Yusril hewanPeliharaan) {
        this.hewanPeliharaan = hewanPeliharaan;
    }

    public void ajakPeliharaanJalanJalanYusril() {
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan peliharaanku bergerak dengan cara: ");
        this.hewanPeliharaan.bergerakYusril();
        System.out.println("--------------------------------");
    }
}
