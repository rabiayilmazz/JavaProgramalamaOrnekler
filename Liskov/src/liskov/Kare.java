/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskov;

/**
 *
 * @author Rabia
 */
public class Kare implements Sekil{
    private double kenar;
    
    public Kare(double kenar){
        this.kenar = kenar;
    }
    
    public Kare(){}
    
    @Override
    public double cevreHesapla() {
        return getKenar()*4;
        
    }

    @Override
    public double alanHesabla() {
        return getKenar()*getKenar();
    }

    /**
     * @return the kenar
     */
    public double getKenar() {
        return kenar;
    }

    /**
     * @param kenar the kenar to set
     */
    public void setKenar(double kenar) {
        this.kenar = kenar;
    }
    
}
