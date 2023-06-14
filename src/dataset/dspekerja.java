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
public class dspekerja {
    private ArrayList<String> namapekerja;
    private ArrayList<String> gajiharian;
    private ArrayList<Integer> totalgaji;
    
    public dspekerja() {
    namapekerja= new ArrayList<>();
    gajiharian = new ArrayList<>();
    totalgaji= new ArrayList<>();
    
}
public void addnamapekerja(String value){
    this.namapekerja.add(value);
}

public ArrayList<String> getDatanamapekerja(){
    return this.namapekerja;
}

public void addgajiharian(String value){
    this.gajiharian.add(value);
}

public ArrayList<String> getDatagajiharian(){
    return this.gajiharian;
}

public void addtotalgaji(Integer value){
    this.totalgaji.add(value);
}

public ArrayList<Integer> getDatatotalgaji(){
    return this.totalgaji;
}


}
