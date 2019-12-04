package frontend;

import backend.*;

public class TestBackend1841720184Yusril {
    public static void main(String[] args) {
//        Kategori1841720184Yusril kat1 = new Kategori1841720184Yusril("Novel","Koleksi buku novel");
//        Kategori1841720184Yusril kat2 = new Kategori1841720184Yusril("Referensi","Buku referensi ilmiah");
//        Kategori1841720184Yusril kat3 = new Kategori1841720184Yusril("Komik","Komik anak-anak");
//        
//        // test insert
//        kat1.saveYusril();
//        kat2.saveYusril();
//        kat3.saveYusril();
//        
//        // test update
//        kat2.setKeteranganYusril("Koleksi buku referensi ilmiah");
//        kat2.saveYusril();
//        
//        // test delete
//        kat3.deleteYusril();
//        
//        // test select all
//        for (Kategori1841720184Yusril k: new Kategori1841720184Yusril().getAllYusril()) {
//            System.out.println("Nama: "+ k.getNamaYusril() + ", Ket: "+k.getKeteranganYusril());
//            
//        }
//        
//        // test search
//        for (Kategori1841720184Yusril k : new Kategori1841720184Yusril().searchYusril("ilmiah")) {
//            System.out.println("Nama: "+ k.getNamaYusril() + ", Ket: "+k.getKeteranganYusril());
//        }
        Anggota1841720184Yusril ang1 = new Anggota1841720184Yusril("Samiun","Salemba","08876425632");
        Anggota1841720184Yusril ang2 = new Anggota1841720184Yusril("Jainudin","Jakarta","0816963278");
        Anggota1841720184Yusril ang3 = new Anggota1841720184Yusril("Budi Setiawan","Bali","08343511189");
        
        // test insert
        ang1.saveYusril();
        ang2.saveYusril();
        ang3.saveYusril();
        
        // test update
        ang2.setAlamatYusril("Bekasi");
        ang2.saveYusril();
        
        // test delete
        ang3.deleteYusril();
        
        // test select all
        for (Anggota1841720184Yusril a: new Anggota1841720184Yusril().getAllYusril()) {
            System.out.println("Nama: "+ a.getNamaYusril() + ", Alamat: "+a.getAlamatYusril()+", Telepon: "+a.getTeleponYusril());
            
        }
        
        // test search
        for (Anggota1841720184Yusril a: new Anggota1841720184Yusril().searchYusril("Bekasi")) {
            System.out.println("Nama: "+ a.getNamaYusril() + ", Alamat: "+a.getAlamatYusril()+", Telepon: "+a.getTeleponYusril());
            
        }
        
    }
}
