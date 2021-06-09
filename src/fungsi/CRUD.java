/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

/**
 *
 * @author BintangDiLangit
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD {

    protected Connection CRUDkoneksi;
    protected PreparedStatement CRUDpsmt;
    protected Statement CRUDstat;
    protected ResultSet CRUDhasil;
    protected String CRUDquery;
    private koneksi connect = new koneksi();

    protected CRUD() {
        try {

            CRUDkoneksi = connect.koneksiDB();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    protected Connection getCRUDkoneksi() {
        return CRUDkoneksi;
    }

    protected void setCRUDkoneksi(Connection CRUDkoneksi) {
        this.CRUDkoneksi = CRUDkoneksi;
    }

    protected PreparedStatement getCRUDpsmt() {
        return CRUDpsmt;
    }

    protected void setCRUDpsmt(PreparedStatement CRUDpsmt) {
        this.CRUDpsmt = CRUDpsmt;
    }

    protected Statement getCRUDstat() {
        return CRUDstat;
    }

    protected void setCRUDstat(Statement CRUDstat) {
        this.CRUDstat = CRUDstat;
    }

    protected ResultSet getCRUDhasil() {
        return CRUDhasil;
    }

    protected void setCRUDhasil(ResultSet CRUDhasil) {
        this.CRUDhasil = CRUDhasil;
    }

    protected String getCRUDquery() {
        return CRUDquery;
    }

    protected void setCRUDquery(String CRUDquery) {
        this.CRUDquery = CRUDquery;
    }

    public ResultSet tampilData() {
        return CRUDhasil;
    }

    public void simpanData(String a, String b, String c) {

    }

    public void simpanData(String a, String b) {

    }

    public void simpanData(String a, String b, String c, String d, String e, String f) {

    }

    public void simpanData(String a, String b, String c, String d, String e) {

    }

    public void simpanData(String a, String b, String c, String d) {

    }

    public void ubahData(String a, String b, String c) {

    }

    public void ubahData(String a, String b, String c, String e) {

    }
    public void ubahData(String a, String b, String c, String d, String e, String f) {

    }
    public void hapusData(String a) {

    }

}