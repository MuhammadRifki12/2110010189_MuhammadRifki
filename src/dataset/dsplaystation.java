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
public class dsplaystation {
 private ArrayList<String> idplaystation;
    private ArrayList<String> namaplaystation;
    private ArrayList<Integer> hargasewa;
    
    public dsplaystation() {
    idplaystation = new ArrayList<>();
    namaplaystation = new ArrayList<>();
    hargasewa= new ArrayList<>();
    
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
