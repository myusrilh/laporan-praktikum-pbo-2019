package backend;

import java.sql.*;
import java.util.ArrayList;

public class Buku1841720184Yusril {

    private int idBuku;
    private Kategori1841720184Yusril kategori = new Kategori1841720184Yusril();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdBukuYusril() {
        return idBuku;
    }

    public void setIdBukuYusril(int idBuku) {
        this.idBuku = idBuku;
    }

    public Kategori1841720184Yusril getKategoriYusril() {
        return kategori;
    }

    public void setKategoriYusril(Kategori1841720184Yusril kategori) {
        this.kategori = kategori;
    }

    public String getJudulYusril() {
        return judul;
    }

    public void setJudulYusril(String judul) {
        this.judul = judul;
    }

    public String getPenerbitYusril() {
        return penerbit;
    }

    public void setPenerbitYusril(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulisYusril() {
        return penulis;
    }

    public void setPenulisYusril(String penulis) {
        this.penulis = penulis;
    }

    public Buku1841720184Yusril() {
    }

    public Buku1841720184Yusril(int idBuku, String judul, String penerbit, String penulis) {
        this.idBuku = idBuku;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }

    public Buku1841720184Yusril getByIdYusril(int id) {
        Buku1841720184Yusril buku = new Buku1841720184Yusril();
        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT "
                + " b.idbuku AS idbuku,"
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis,"
                + " k.idkategori AS idkategori,"
                + " k.nama AS nama,"
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + " WHERE b.idbuku = '" + id + "'");
        try {
            while (rs.next()) {
                buku = new Buku1841720184Yusril();
                buku.setIdBukuYusril(rs.getInt("idbuku"));
                buku.getKategoriYusril().setIdkategoriYusril(rs.getInt("idkategori"));
                buku.getKategoriYusril().setNamaYusril(rs.getString("nama"));
                buku.getKategoriYusril().setKeteranganYusril(rs.getString("keterangan"));
                buku.setJudulYusril(rs.getString("judul"));
                buku.setPenerbitYusril(rs.getString("penerbit"));
                buku.setPenulisYusril(rs.getString("penulis"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }

    public ArrayList<Buku1841720184Yusril> getAllYusril() {
        ArrayList<Buku1841720184Yusril> ListBuku = new ArrayList<>();

        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT "
                + " b.idbuku AS idbuku,"
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis,"
                + " k.idkategori AS idkategori,"
                + " k.nama AS nama,"
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori ");
        try {
            while (rs.next()) {
                Buku1841720184Yusril buku = new Buku1841720184Yusril();
                buku.setIdBukuYusril(rs.getInt("idbuku"));
                buku.getKategoriYusril().setIdkategoriYusril(rs.getInt("idkategori"));
                buku.getKategoriYusril().setNamaYusril(rs.getString("nama"));
                buku.getKategoriYusril().setKeteranganYusril(rs.getString("keterangan"));
                buku.setJudulYusril(rs.getString("judul"));
                buku.setPenerbitYusril(rs.getString("penerbit"));
                buku.setPenulisYusril(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public ArrayList<Buku1841720184Yusril> searchYusril(String keyword) {
        ArrayList<Buku1841720184Yusril> ListBuku = new ArrayList<>();

        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * "
                + " b.idbuku AS idbuku,"
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis,"
                + " k.idkategori AS idkategori,"
                + " k.nama AS nama,"
                + " k.keterangan AS keterangan "
                + " FROM buku b "
                + " LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                + " WHERE b.judul LIKE '%" + keyword + "%'"
                + " OR b.penerbit LIKE '%" + keyword + "%'"
                + " OR b.penulis LIKE '%" + keyword + "%'");
        try {
            while (rs.next()) {
                Buku1841720184Yusril buku = new Buku1841720184Yusril();
                buku.setIdBukuYusril(rs.getInt("idbuku"));
                buku.getKategoriYusril().setIdkategoriYusril(rs.getInt("idkategori"));
                buku.getKategoriYusril().setNamaYusril(rs.getString("nama"));
                buku.getKategoriYusril().setKeteranganYusril(rs.getString("keterangan"));
                buku.setJudulYusril(rs.getString("judul"));
                buku.setPenerbitYusril(rs.getString("penerbit"));
                buku.setPenulisYusril(rs.getString("penulis"));

                ListBuku.add(buku);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }

    public void saveYusril() {
        if (getByIdYusril(idBuku).getIdBukuYusril() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    + "'" + this.judul + "',"
                    + "'" + this.getKategoriYusril().getIdkategoriYusril() + "',"
                    + "'" + this.penulis + "',"
                    + "'" + this.penerbit + "')";
            this.idBuku = DBHelper1841720184Yusril.insertQueryGetIdYusril(SQL);
        } else {
            String SQL = "UPDATE buku SET ="
                    + "judul = '" + this.judul + "',"
                    + "idkategori = '" + this.getKategoriYusril().getIdkategoriYusril() + "',"
                    + "penulis = '" + this.penulis + "',"
                    + "penerbit = '" + this.penerbit + "'"
                    + "WHERE idbuku = '" + this.idBuku + "'";
            DBHelper1841720184Yusril.executeQueryYusril(SQL);
        }
    }

    public void deleteYusril() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idBuku + "'";
        DBHelper1841720184Yusril.executeQueryYusril(SQL);
    }
}
