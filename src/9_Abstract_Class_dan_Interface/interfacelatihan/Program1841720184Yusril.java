package pbominggu9.interfacelatihan;

public class Program1841720184Yusril {
    
    public static void main(String[] args) {
        Rektor1841720184Yusril pakRektor = new Rektor1841720184Yusril();
        
        Mahasiswa1841720184Yusril mahasiswaBiasa = new Mahasiswa1841720184Yusril("Charlie");
        Sarjana1841720184Yusril sarjanaCumlaude = new Sarjana1841720184Yusril("Dini");
        PascaSarjana1841720184Yusril masterCumlaude = new PascaSarjana1841720184Yusril("Elok");

//        pakRektor.beriSertifikatCumlaudeYusril(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaudeYusril(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaudeYusril(masterCumlaude);
        pakRektor.beriSertifikatMawapresYusril(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapresYusril(masterCumlaude);
        
    }
    
}
