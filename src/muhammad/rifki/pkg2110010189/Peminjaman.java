/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rifki.pkg2110010189;

/**
 *
 * @author ASUS
 */
import java.util.Date;
public class Peminjaman {
   
    private int noTransaksi;
    private String namaAdmin;
    private Date tanggalPeminjaman;
    private int idPelanggan;
    private String NIK;
    private String namaPelanggan;
    private String nomorTelepon;
    private String alamat;
    private int idPlaystation;
    private String namaPlaystation;
    private double hargaSewa;
    private int lamaSewa;
    private double totalHarga;
    private Date tanggalPengembalian;

    public Peminjaman(int noTransaksi, String namaAdmin, Date tanggalPeminjaman, int idPelanggan, String NIK,
                      String namaPelanggan, String nomorTelepon, String alamat, int idPlaystation,
                      String namaPlaystation, double hargaSewa, int lamaSewa, double totalHarga,
                      Date tanggalPengembalian) {
        this.noTransaksi = noTransaksi;
        this.namaAdmin = namaAdmin;
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.idPelanggan = idPelanggan;
        this.NIK = NIK;
        this.namaPelanggan = namaPelanggan;
        this.nomorTelepon = nomorTelepon;
        this.alamat = alamat;
        this.idPlaystation = idPlaystation;
        this.namaPlaystation = namaPlaystation;
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
        this.totalHarga = totalHarga;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public int getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(int noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

    public Date getTanggalPeminjaman() {
        return tanggalPeminjaman;
    }

    public void setTanggalPeminjaman(Date tanggalPeminjaman) {
        this.tanggalPeminjaman = tanggalPeminjaman;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getIdPlaystation() {
        return idPlaystation;
    }

    public void setIdPlaystation(int idPlaystation) {
        this.idPlaystation = idPlaystation;
    }

    public String getNamaPlaystation() {
            return namaPlaystation;
    }

    public void setNamaPlaystation(String namaPlaystation) {
        this.namaPlaystation = namaPlaystation;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }
}
  


