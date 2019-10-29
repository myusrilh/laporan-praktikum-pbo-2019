package pbominggu9.interfacelatihan;

public class Rektor1841720184Yusril {

    Mahasiswa1841720184Yusril mahasiswa;

    public void beriSertifikatCumlaudeYusril(ICumlaude1841720184Yusril mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        mahasiswa.kuliahDiKampusYusril();
        mahasiswa.lulusYusril();

        mahasiswa.meraihIPKTinggiYusril();

        System.out.println("--------------------------------------------");
    }

    public void beriSertifikatMawapresYusril(IBerprestasi1841720184Yusril mahasiswa) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana anda bisa berprestasi?");

        mahasiswa.menjuaraiKompetisiYusril();
        mahasiswa.membuatPublikasiIlmiahYusril();

        System.out.println("--------------------------------------------");
    }

//    public int beriSertifikatCumlaudeYusril(Mahasiswa1841720184Yusril mahasiswa) {
//        this.mahasiswa = mahasiswa;
//        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
//        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
//        
//        System.out.print("Nama Saya: "+mahasiswa.nama);
//        mahasiswa.kuliahDiKampusYusril();
//
//        System.out.println("--------------------------------------------");
//        return 0;
//    }
//    public void beriSertifikatCumlaudeYusril(){
//        Rektor1841720184Yusril.this.beriSertifikatCumlaudeYusril(mahasiswa);
//    }
}
