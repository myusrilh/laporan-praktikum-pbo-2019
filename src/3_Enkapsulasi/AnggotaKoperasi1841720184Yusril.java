package com.mycompany.tugasjobsheet3smt3;

public class AnggotaKoperasi1841720184Yusril {

    private String ktp;
    private String nama;
    private int limitpinjaman;
    private int pinjaman;

    AnggotaKoperasi1841720184Yusril(String ktp, String nama, int limitpinjaman) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitpinjaman = limitpinjaman;
        this.pinjaman = 0;
    }

    public String getKtp() {
        return ktp;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getLimitPinjaman() {
        return limitpinjaman;
    }

    public void setLimitpinjaman(int limitpinjaman) {
        this.limitpinjaman = limitpinjaman;
    }

    public void pinjam(int pinjaman) {
        if (pinjaman > getLimitPinjaman()) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            this.pinjaman += pinjaman;
        }
    }
    
    public void angsur(int pinjaman){
        this.pinjaman -= pinjaman;
    }
    
    public int getJumlahPinjaman(){
        return pinjaman;
    } 
    
    
    
}
