/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Peminjaman1841720184Yusril {

    private int idpeminjaman, idanggota, idbuku;
    private Anggota1841720184Yusril anggota = new Anggota1841720184Yusril();
    private Buku1841720184Yusril buku = new Buku1841720184Yusril();
    private String tanggalPinjam;
    private String tanggalKembali;

    public Peminjaman1841720184Yusril() {

    }

    public Peminjaman1841720184Yusril(Anggota1841720184Yusril anggota, Buku1841720184Yusril buku, String tanggalpinjam, String tanggalkembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalpinjam;
        this.tanggalKembali = tanggalkembali;
    }

    public int getIdanggotaYusril() {
        return idanggota;
    }

    public void setIdanggotaYusril(int idanggota) {
        this.idanggota = idanggota;
    }

    public int getIdbukuYusril() {
        return idbuku;
    }

    public void setIdbukuYusril(int idbuku) {
        this.idbuku = idbuku;
    }

    public int getIdpeminjamanYusril() {
        return idpeminjaman;
    }

    public void setIdpeminjamanYusril(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota1841720184Yusril getAnggotaYusril() {
        return anggota;
    }

    public void setAnggotaYusril(Anggota1841720184Yusril anggota) {
        this.anggota = anggota;
    }

    public Buku1841720184Yusril getBukuYusril() {
        return buku;
    }

    public void setBukuYusril(Buku1841720184Yusril buku) {
        this.buku = buku;
    }

    public String getTanggalPinjamYusril() {
        return tanggalPinjam;
    }

    public void setTanggalPinjamYusril(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembaliYusril() {
        return tanggalKembali;
    }

    public void setTanggalKembaliYusril(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman1841720184Yusril getByIdYusril(int id) {
        Peminjaman1841720184Yusril pinjam = new Peminjaman1841720184Yusril();
        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS tanggalpinjam, "
                + " p.tanggalkembali AS tanggalkembali, "
                + " a.idanggota AS idanggota, "
                + " b.idbuku AS idbuku "
                + " FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + " LEFT JOIN buku b ON p.idbuku = b.idbuku WHERE p.idpeminjaman = '" + id + "'");

        try {
            while (rs.next()) {
                pinjam = new Peminjaman1841720184Yusril();
                pinjam.setIdpeminjamanYusril(rs.getInt("idpeminjaman"));
                pinjam.setIdanggotaYusril(rs.getInt("idanggota"));
                pinjam.setIdbukuYusril(rs.getInt("idbuku"));
                pinjam.setTanggalPinjamYusril(rs.getString("tanggalpinjam"));

                pinjam.setTanggalKembaliYusril(rs.getString("tanggalkembali"));
                pinjam.setAnggotaYusril(new Anggota1841720184Yusril().getByIdYusril(getIdanggotaYusril()));
                pinjam.setBukuYusril(new Buku1841720184Yusril().getByIdYusril(pinjam.getIdbukuYusril()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pinjam;
    }

    public ArrayList<Peminjaman1841720184Yusril> getAllYusril() {
        ArrayList<Peminjaman1841720184Yusril> ListPinjam = new ArrayList();
        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT "
                + "p.idpeminjaman AS idpeminjaman, "
                + "p.tanggalpinjam AS tanggalpinjam, "
                + "p.tanggalkembali AS tanggalkembali, "
                + "a.idanggota AS idanggota, "
                + "b.idbuku AS idbuku "
                + "FROM peminjaman p LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                + "LEFT JOIN buku b ON p.idbuku = b.idbuku");
        try {
            while (rs.next()) {
                Peminjaman1841720184Yusril pinjam = new Peminjaman1841720184Yusril();
                pinjam.setIdpeminjamanYusril(rs.getInt("idpeminjaman"));
                pinjam.setIdanggotaYusril(rs.getInt("idanggota"));
                pinjam.setIdbukuYusril(rs.getInt("idbuku"));
                pinjam.setTanggalPinjamYusril(rs.getString("tanggalpinjam"));
                pinjam.setTanggalKembaliYusril(rs.getString("tanggalkembali"));
                pinjam.setAnggotaYusril(new Anggota1841720184Yusril().getByIdYusril(pinjam.getIdanggotaYusril()));
                pinjam.setBukuYusril(new Buku1841720184Yusril().getByIdYusril(pinjam.getIdbukuYusril()));

                ListPinjam.add(pinjam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPinjam;
    }

    public void saveYusril() {
        if (getByIdYusril(idpeminjaman).getIdpeminjamanYusril() == 0) {
            String sql = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) "
                    + "values ("
                    + "'" + this.getAnggotaYusril().getIdanggotaYusril() + "', "
                    + "'" + this.getBukuYusril().getIdBukuYusril() + "',"
                    + "'" + this.tanggalPinjam + "', "
                    + "'" + this.tanggalKembali + "' "
                    + ")";
            this.idpeminjaman = DBHelper1841720184Yusril.insertQueryGetIdYusril(sql);
        } else {
            String sql = "UPDATE buku SET "
                    + "idanggota = '" + this.getAnggotaYusril().getIdanggotaYusril() + "', "
                    + "idbuku = '" + this.getBukuYusril().getIdBukuYusril() + "', "
                    + "tanggalpinjam = '" + this.tanggalPinjam + "', "
                    + "tanggalkembali = '" + this.tanggalKembali + "'";
            DBHelper1841720184Yusril.executeQueryYusril(sql);
        }
    }

    public void cariAnggotaYusril(int id) {
        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM anggota WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                getAnggotaYusril().setIdanggotaYusril(rs.getInt("idanggota"));
                getAnggotaYusril().setNamaYusril(rs.getString("nama"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cariBukuYusril(int id) {
        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM buku WHERE idbuku = '" + id + "'");

        try {
            while (rs.next()) {
                getBukuYusril().setIdBukuYusril(rs.getInt("idbuku"));
                getBukuYusril().setJudulYusril(rs.getString("judul"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteYusril() {
        String sql = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper1841720184Yusril.executeQueryYusril(sql);
    }
}
