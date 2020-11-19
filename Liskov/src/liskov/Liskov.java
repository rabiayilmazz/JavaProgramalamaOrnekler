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
public class Liskov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kare kare = new Kare();
        kare.setKenar(6);
        Kare kare2 = new Kare(4);
        
        Toplayici t = new Toplayici();
        Dortgen d = new Dortgen();
        d.setKenar1(8);
        d.setKenar2(4);
        Dortgen d2 = new Dortgen(4,6);
        
        ArrayList<Sekil> liste = new ArrayList<>();
        
        liste.add(kare);
        liste.add(kare2);
        liste.add(d);
        liste.add(d2);
        
        System.out.println(t.cevreToplayivci(liste));
        System.out.println(t.alanToplayici(liste));
        
       /*
        System.out.println(kare.alanHesabla());
        System.out.println(kare.cevreHesapla());
        
        System.out.println(kare2.alanHesabla());
        System.out.println(kare2.cevreHesapla());
        
        System.out.println(d.alanHesabla());
        System.out.println(d.cevreHesapla());
        
        System.out.println(d2.alanHesabla());
        System.out.println(d2.cevreHesapla());
        */        
    }
    
}
