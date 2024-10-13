/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author trimbk
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon logoImage;
    
    private ArrayList<Feature> fi;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        fi = new ArrayList<Feature>();
        
    }
    
    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public ArrayList<Feature> getFeatures(){
        return fi;
    }
    
     public Feature addNewFeature(){
        Feature feature = new Feature();
        fi.add(feature);
        return feature;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
}
