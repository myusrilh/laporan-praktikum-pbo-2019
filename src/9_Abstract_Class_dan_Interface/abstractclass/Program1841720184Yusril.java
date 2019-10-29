package pbominggu9.abstractclass;

public class Program1841720184Yusril {

    public static void main(String[] args) {
        Kucing1841720184Yusril kucingKampung = new Kucing1841720184Yusril();
        Ikan1841720184Yusril lumbaLumba = new Ikan1841720184Yusril();
        
        Orang1841720184Yusril ani = new Orang1841720184Yusril("Ani");
        Orang1841720184Yusril budi = new Orang1841720184Yusril("Budi");
        
        ani.peliharaanHewanYusril(kucingKampung);
        budi.peliharaanHewanYusril(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalanYusril();
        budi.ajakPeliharaanJalanJalanYusril();
    }
    
}
