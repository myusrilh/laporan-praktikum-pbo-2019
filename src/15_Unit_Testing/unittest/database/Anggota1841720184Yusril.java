package unittest.database;

import java.util.ArrayList;
import java.sql.ResultSet;

public class Anggota1841720184Yusril {

    private int idanggota;
    private String nama;
    private String alamat;
    public String telepon;

    public Anggota1841720184Yusril() {
    }

    public Anggota1841720184Yusril(String nama, String alamat,String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggotaYusril() {
        return idanggota;
    }

    public void setIdanggotaYusril(int idanggota) {
        this.idanggota = idanggota;
    }

    public String getNamaYusril() {
        return nama;
    }

    public void setNamaYusril(String nama) {
        this.nama = nama;
    }

    public String getAlamatYusril() {
        return alamat;
    }

    public void setAlamatYusril(String alamat) {
        this.alamat = alamat;
    }

    public String getTeleponYusril() {
        return telepon;
    }

    public void setTeleponYusril(String telepon) {
        this.telepon = telepon;
    }
    
    public ArrayList<Anggota1841720184Yusril> getByNamaAlamatAndTelepon(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720184Yusril> ListAnggota = new ArrayList<>();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0)) {
            rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM anggota Where nama = '"
                    + nama + "' and alamat = '" + alamat + "' and telepon = '" + telepon + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM anggota Where nama = '"
                    + nama + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() == 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM anggota Where telepon = '"
                    + telepon + "'");
        } else {
            rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM anggota Where alamat'" + alamat + "'  ");
        }

        try {
            while (rs.next()) {
                Anggota1841720184Yusril ang = new Anggota1841720184Yusril();
                ang.setIdanggotaYusril(rs.getInt("idanggota"));
                ang.setNamaYusril(rs.getString("nama"));
                ang.setAlamatYusril(rs.getString("alamat"));
                ang.setTeleponYusril(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }
    
     public Anggota1841720184Yusril getByIdYusril(int id) {
        Anggota1841720184Yusril ang = new Anggota1841720184Yusril();
        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                ang = new Anggota1841720184Yusril();
                ang.setIdanggotaYusril(rs.getInt("idanggota"));
                ang.setNamaYusril(rs.getString("nama"));
                ang.setAlamatYusril(rs.getString("alamat"));
                ang.setTeleponYusril(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ang;
    }

    public ArrayList<Anggota1841720184Yusril> getAllYusril() {
        ArrayList<Anggota1841720184Yusril> ListAnggota = new ArrayList<>();

        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720184Yusril ang = new Anggota1841720184Yusril();
                ang.setIdanggotaYusril(rs.getInt("idanggota"));
                ang.setNamaYusril(rs.getString("nama"));
                ang.setAlamatYusril(rs.getString("alamat"));
                ang.setTeleponYusril(rs.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720184Yusril> searchYusril(String keyword) {
        ArrayList<Anggota1841720184Yusril> ListAnggota = new ArrayList<>();

        String sql = "SELECT * FROM anggota WHERE "
                + " nama LIKE '%" + keyword + "%'"
                + " OR alamat LIKE '%" + keyword + "%'"
                + " OR telepon LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper1841720184Yusril.selectQueryYusril(sql);

        try {
            while (rs.next()) {
                Anggota1841720184Yusril ang = new Anggota1841720184Yusril();
                ang.setIdanggotaYusril(rs.getInt("idanggota"));
                ang.setNamaYusril(rs.getString("nama"));
                ang.setAlamatYusril(rs.getString("alamat"));
                ang.setTeleponYusril(rs.getString("telepon"));

                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void saveYusril() {
        if (getByIdYusril(idanggota).getIdanggotaYusril() == 0) {
            String sql = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + " '" + this.nama + "',"
                    + " '" + this.alamat + "',"
                    + " '" + this.telepon + "'"
                    + ") ";

            this.idanggota = DBHelper1841720184Yusril.insertQueryGetIdYusril(sql);
        } else {
            String sql = "UPDATE anggota SET "
                    + "  nama ='" + this.nama + "',"
                    + "  alamat ='" + this.alamat + "', "
                    + "  telepon ='" + this.telepon + "' "
                    + "  WHERE idanggota ='" + this.idanggota + "'";

            DBHelper1841720184Yusril.executeQueryYusril(sql);
        }
    }

    public void deleteYusril() {
        String sql = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper1841720184Yusril.executeQueryYusril(sql);
    }

}
