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
public class CRUD_MenuAnakKos extends CRUD_MenuCatering{
     @Override
    public void setNamaMenuCatering(String namaMenuCatering) {
        super.setNamaMenuCatering(namaMenuCatering); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJumlahKaloriMenuCatering(String jumlahKaloriMenuCatering) {
        super.setJumlahKaloriMenuCatering(jumlahKaloriMenuCatering); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setJadwalHariMenuCatering(String jadwalHariMenuCatering) {
        super.setJadwalHariMenuCatering(jadwalHariMenuCatering); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setHargaLanggananSeminggu(String hargaLanggananSeminggu) {
        super.setHargaLanggananSeminggu(hargaLanggananSeminggu); //To change body of generated methods, choose Tools | Templates.
    }
    
     @Override
    public void setHargaLanggananSebulan(String hargaLanggananSebulan) {
        super.setHargaLanggananSebulan(hargaLanggananSebulan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet tampilData() {
        CRUDquery = "select*from menu_anakKost";
        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (Exception e) {
        }
        return CRUDhasil;
    }

    @Override
    public void simpanData(String hari, String namaMenu, String jumlahKalori) {
        CRUDquery = "insert into menu_anakKost (hari,nama,jumlahKalori) values (?,?,?)";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, hari);
            CRUDpsmt.setString(2, namaMenu);
            CRUDpsmt.setString(3, jumlahKalori);

            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void ubahData(String hari, String namaMenu, String jumlahKalori) {
        CRUDquery = "update menu_anakKost set nama=?,jumlahKalori=? where hari=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(3, hari);
            CRUDpsmt.setString(1, namaMenu);
            CRUDpsmt.setString(2, jumlahKalori);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void hapusData(String hari) {
        CRUDquery = "delete from menu_anakKost where hari=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, hari);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

//    @Override
//    public String hargaLanggananSeminggu() {
//        String anakKosSeminggu = "Rp. 150000";
//        hargaLanggananSeminggu = anakKosSeminggu;
//        return hargaLanggananSeminggu;
//    }
//
//    @Override
//    public String hargaLanggananSebulan() {
//        String anakKosSebulan = "Rp. 500000";
//        hargaLanggananSebulan = anakKosSebulan;
//        return hargaLanggananSebulan;
//    }
}
