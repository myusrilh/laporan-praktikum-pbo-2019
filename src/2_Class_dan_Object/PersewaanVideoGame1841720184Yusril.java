package jobsheet2smt3;

public class PersewaanVideoGame1841720184Yusril {

    private long id;
    private String namaMember;
    public String namaGame;
    public int hargaSatuan;
    public int lamaSewa;
    
    public void tampilDataPeminjamanYusril(long id, String namaMember){
        this.id = id;
        this.namaMember = namaMember;
        System.out.println("ID Member       : "+id);
        System.out.println("Nama Member     : "+namaMember);
        System.out.println("Nama Video Game : "+namaGame);
    }
    
    public void tampilHargaTotalYusril(){
        int total = hargaSatuan * lamaSewa;
        System.out.println("Harga yang harus dibayar : "+total);
    }
}
