package backend;

import java.util.ArrayList;
import java.sql.*;

public class Kategori1841720184Yusril {

    private int idkategori;
    private String nama;
    private String keterangan;

    public Kategori1841720184Yusril() {
    }

    public String toString() {
        return nama;
    }

    public Kategori1841720184Yusril(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public void setIdkategoriYusril(int idkategori) {
        this.idkategori = idkategori;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public void setKeteranganYusril(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getIdkategoriYusril() {
        return idkategori;
    }

    public String getNamaYusril() {
        return nama;
    }

    public String getKeteranganYusril() {
        return keterangan;
    }

    public Kategori1841720184Yusril getByIdYusril(int id) {
        Kategori1841720184Yusril kat = new Kategori1841720184Yusril();

        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM kategori "
                + " WHERE idkategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori1841720184Yusril();
                kat.setIdkategoriYusril(rs.getInt("idkategori"));
                kat.setNamaYusril(rs.getString("nama"));
                kat.setKeteranganYusril(rs.getString("keterangan"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720184Yusril> getAllYusril() {
        ArrayList<Kategori1841720184Yusril> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720184Yusril kat = new Kategori1841720184Yusril();
                kat.setIdkategoriYusril(rs.getInt("idkategori"));
                kat.setNamaYusril(rs.getString("nama"));
                kat.setKeteranganYusril(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720184Yusril> searchYusril(String keyword) {
        ArrayList<Kategori1841720184Yusril> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE "
                + " nama LIKE '%" + keyword + "%'"
                + " OR keterangan LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril(sql);

        try {
            while (rs.next()) {
                Kategori1841720184Yusril kat = new Kategori1841720184Yusril();
                kat.setIdkategoriYusril(rs.getInt("idkategori"));
                kat.setNamaYusril(rs.getString("nama"));
                kat.setKeteranganYusril(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveYusril() {
        if (getByIdYusril(idkategori).getIdkategoriYusril() == 0) {
            String sql = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + " '" + this.nama + "',"
                    + " '" + this.keterangan + "'"
                    + ") ";

            this.idkategori = DBHelper1841720184Yusril.insertQueryGetIdYusril(sql);
        } else {
            String sql = "UPDATE kategori SET "
                    + "  nama ='" + this.nama + "',"
                    + "  keterangan ='" + this.keterangan + "' "
                    + "  WHERE idkategori ='" + this.idkategori + "'";

            DBHelper1841720184Yusril.executeQueryYusril(sql);
        }
    }

    public void deleteYusril() {
        String sql = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1841720184Yusril.executeQueryYusril(sql);
    }

}
