/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import java.sql.ResultSet;

/**
 *
 * @author BintangDiLangit
 */
public class CRUD_transaksi extends CRUD{
    private String nama, pilihPaketCatering, durasiBerlangganan, metodePembayaran;

    public String getPilihPaketCatering() {
        return pilihPaketCatering;
    }

    public void setPilihPaketCatering(String pilihPaketCatering) {
        this.pilihPaketCatering = pilihPaketCatering;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDurasiBerlangganan() {
        return durasiBerlangganan;
    }

    public void setDurasiBerlangganan(String durasiBerlangganan) {
        this.durasiBerlangganan = durasiBerlangganan;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }

    
       @Override
    public ResultSet tampilData() {
        CRUDquery = "select*from transaksi,konfirmasi_transaksi where transaksi.nama=konfirmasi_transaksi.nama";
        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (Exception e) {
        }
        return CRUDhasil;
    }
    
    @Override
    public void simpanData(String nama, String pilihPaket, String durasiBerlangganan, String metodePembayaran) {
        CRUDquery = "insert into transaksi (nama,pilihPaket,durasiBerlangganan,metodePembayaran)values (?,?,?,?)";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama);
            CRUDpsmt.setString(2, pilihPaket);
            CRUDpsmt.setString(3, durasiBerlangganan);
            CRUDpsmt.setString(4, metodePembayaran);


            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void ubahData(String nama, String alamat, String nohp, String umur, String tinggiBadan, String beratBadan) {
        CRUDquery = "update transaksi set nama=?,alamat=?,nohp=?,umur=?,tinggiBadan=?,beratBadan? where hari=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama);
            CRUDpsmt.setString(2, alamat);
            CRUDpsmt.setString(3, nohp);
            CRUDpsmt.setString(4, umur);
            CRUDpsmt.setString(5, tinggiBadan);
            CRUDpsmt.setString(6, beratBadan);

            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void hapusData(String nama) {
        CRUDquery = "delete from customer where nama=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
