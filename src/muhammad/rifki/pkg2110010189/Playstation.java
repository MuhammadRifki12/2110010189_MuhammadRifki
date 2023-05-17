/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammad.rifki.pkg2110010189;

/**
 *
 * @author ASUS
 */
public class Playstation {
    // Playstation.java
    private int idPlaystation;
    private String namaPlaystation;
    private double hargaSewa;

    public Playstation(int idPlaystation, String namaPlaystation, double hargaSewa) {
        this.idPlaystation = idPlaystation;
        this.namaPlaystation = namaPlaystation;
        this.hargaSewa = hargaSewa;
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
}


