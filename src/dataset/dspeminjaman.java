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
public class dspeminjaman {
    private ArrayList<String> idpelanggan;
    private ArrayList<String> namapelanggan;
    private ArrayList<String> teleponpelanggan;
    private ArrayList<String> alamat;
    private ArrayList<String> idplaystation;
    private ArrayList<String> namaplaystation;
    private ArrayList<Integer> hargasewa;
    
    public dspeminjaman() {
    idpelanggan= new ArrayList<>();
    namapelanggan= new ArrayList<>();
    teleponpelanggan= new ArrayList<>();
    alamat= new ArrayList<>();
    idplaystation = new ArrayList<>();
    namaplaystation = new ArrayList<>();
    hargasewa= new ArrayList<>();

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

public void addidplaystation(String value){
    this.idplaystation.add(value);
}

public ArrayList<String> getDataidplaystation(){
    return this.idplaystation;
}

public void addnamaplaystation(String value){
    this.namaplaystation.add(value);
}

public ArrayList<String> getDatanamaplaystation(){
    return this.namaplaystation;
}

public void addhargasewa(Integer value){
    this.hargasewa.add(value);
}

public ArrayList<Integer> getDatahargasewa(){
    return this.hargasewa;
}

}
