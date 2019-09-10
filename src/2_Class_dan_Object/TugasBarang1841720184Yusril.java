/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2smt3;

/**
 *
 * @author asus
 */
public class TugasBarang1841720184Yusril {

    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJualYusril() {
        double hargaJual = hargaDasar - (diskon * hargaDasar);
        return (int) hargaJual;
    }

    public void tampilDataYusril() {
        System.out.println("Kode Barang         : "+kode);
        System.out.println("Nama Barang         : "+namaBarang);
        System.out.println("Harga Dasar Barang  : "+hargaDasar);
        System.out.println("Diskon Barang       : "+diskon);
        System.out.println("Harga Total Barang  : "+hitungHargaJualYusril());
    }
}
