package pbominggu9.interfacelatihan;

public class PascaSarjana1841720184Yusril extends Mahasiswa1841720184Yusril implements ICumlaude1841720184Yusril,IBerprestasi1841720184Yusril {

    public PascaSarjana1841720184Yusril(String nama) {
        super(nama);
    }

    @Override
    public void lulusYusril() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiYusril() {
        System.out.println("IPK-ku lebih dari 3,71");
    }
    
    @Override
    public void kuliahDiKampusYusril(){
        super.kuliahDiKampusYusril();
    }

    @Override
    public void menjuaraiKompetisiYusril() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiahYusril() {
        System.out.println("Saya menerbitkan artikel di jurnal INTERNASIONAL");
    }

}
