package pbominggu9.interfacelatihan;

public class Sarjana1841720184Yusril extends Mahasiswa1841720184Yusril implements ICumlaude1841720184Yusril, IBerprestasi1841720184Yusril {

    public Sarjana1841720184Yusril(String nama) {
        super(nama);
    }

    @Override
    public void lulusYusril() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiYusril() {
        System.out.println("IPK-ku lebih dari 3,51");
    }

    @Override
    public void kuliahDiKampusYusril() {
        super.kuliahDiKampusYusril();
    }

    @Override
    public void menjuaraiKompetisiYusril() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahYusril() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }

}
