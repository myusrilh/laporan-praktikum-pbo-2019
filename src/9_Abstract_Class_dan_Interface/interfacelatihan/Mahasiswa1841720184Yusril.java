package pbominggu9.interfacelatihan;

public class Mahasiswa1841720184Yusril implements ICumlaude1841720184Yusril {

    protected String nama;

    public Mahasiswa1841720184Yusril(String nama) {
        this.nama = nama;
    }

    @Override
    public void kuliahDiKampusYusril() {
        System.out.println("Aku mahasiswa, namaku " + this.nama);
        System.out.println("Aku berkuliah di kampus.");
    }

    @Override
    public void lulusYusril() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiYusril() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
}
