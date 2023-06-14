/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class dspelanggan {
 private ArrayList<String> idpelanggan;
    private ArrayList<String> namapelanggan;
    private ArrayList<String> teleponpelanggan;
    private ArrayList<String> alamat;
    
    public dspelanggan() {
    idpelanggan= new ArrayList<>();
    namapelanggan= new ArrayList<>();
    teleponpelanggan= new ArrayList<>();
    alamat= new ArrayList<>();
}
public void addidpelanggan(String value){
    this.idpelanggan.add(value);
}

public ArrayList<String> getDataidpelanggan(){
    return this.idpelanggan;
}

public void addnamapelanggan(String value){
    this.namapelanggan.add(value);
}

public ArrayList<String> getDatanamapelanggan(){
    return this.namapelanggan;
}

public void addteleponpelanggan(String value){
    this.teleponpelanggan.add(value);
}

public ArrayList<String> getDatateleponpelanggan(){
    return this.teleponpelanggan;
}

public void addalamat(String value){
    this.alamat.add(value);
}

public ArrayList<String> getDataalamat(){
    return this.alamat;
}

}
