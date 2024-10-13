/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author trimbk
 */
public class Feature {
    private String name;
    private Hashtable<Product, Object> pv;
    private static final ArrayList<Feature> fi = new ArrayList<Feature>();
    public static ArrayList<Feature> getAllInstances(){
        return fi;
    
}
    
    public Feature(){
        this.pv = new Hashtable<Product, Object>();
        fi.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Object getValue(Product owner) {
        return pv.get(owner);
    }
    
    public void setValue(Product owner, Object value){
        pv.put(owner, value);
    }
    
    public void removeHashKey(Product owner){
        pv.remove(owner);
        if(pv.size() == 0){
            fi.remove(this);
        }
    }
    
    public String getProductAndValue(){
        return pv.toString();
    }
    
    @Override
    public String toString(){
        return this.name == null ? "New Feature" : this.name;
    }
}



