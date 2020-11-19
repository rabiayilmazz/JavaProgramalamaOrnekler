/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskov;

import java.util.ArrayList;

/**
 *
 * @author Rabia
 */
public class Toplayici {
    public double cevreToplayivci(ArrayList<Sekil> sekiller){
        double toplam=0;
        for(Sekil sekil : sekiller){
            toplam += sekil.cevreHesapla();
        }
        return toplam;
    }
    public double alanToplayici(ArrayList<Sekil> sekiller){
        double toplam=0;
        for(Sekil sekil2 : sekiller){
            toplam += sekil2.alanHesabla();
        }
        return toplam;
    }
    
}
