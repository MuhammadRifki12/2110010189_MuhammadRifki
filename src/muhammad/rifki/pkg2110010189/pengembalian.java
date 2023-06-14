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

public class Pengembalian {
    private int noTransaksi;
    private String namaAdmin;
    private Date tanggalPengembalian;
    private int idPelanggan;
    private String NIK;
    private String namaPelanggan;
    private String nomorTelepon;
    private String alamat;
    private int idPlaystation;
    private String playstation;
    private double totalHarga;
    private int keterlambatan;
    private double denda;
    private double totalDenda;
    private double totalBayar;
    private double bayar;
    private double kembalian;

    public Pengembalian(int noTransaksi, String namaAdmin, Date tanggalPengembalian, int idPelanggan, String NIK,
                        String namaPelanggan, String nomorTelepon, String alamat, int idPlaystation,
                        String playstation, double totalHarga, int keterlambatan, double denda,
                        double totalDenda, double totalBayar, double bayar, double kembalian) {
        this.noTransaksi = noTransaksi;
        this.namaAdmin = namaAdmin;
        this.tanggalPengembalian = tanggalPengembalian;
        this.idPelanggan = idPelanggan;
        this.NIK = NIK;
        this.namaPelanggan = namaPelanggan;
        this.nomorTelepon = nomorTelepon;
        this.alamat = alamat;
        this.idPlaystation = idPlaystation;
        this.playstation = playstation;
        this.totalHarga = totalHarga;
        this.keterlambatan = keterlambatan;
        this.denda = denda;
        this.totalDenda = totalDenda;
        this.totalBayar = totalBayar;
        this.bayar = bayar;
        this.kembalian = kembalian;
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

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
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

    public String getPlaystation() {
        return playstation;
    }

    public void setPlaystation(String playstation) {
        this.playstation = playstation;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public int getKeterlambatan() {
        return keterlambatan;
    }

    public void setKeterlambatan(int keterlambatan) {
        this.keterlambatan = keterlambatan;
    }

    public double getDenda() {
        return denda;
    }

    public void setDenda(double denda) {
        this.denda = denda;
    }

    public double getTotalDenda() {
        return totalDenda;
    }

    public void setTotalDenda(double totalDenda) {
        this.totalDenda = totalDenda;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    public double getKembalian() {
        return kembalian;
    }

    public void setKembalian(double kembalian) {
        this.kembalian = kembalian;
    }
}



