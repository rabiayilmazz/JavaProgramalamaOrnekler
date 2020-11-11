/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bedenkitleıneksi;
import java.util.Scanner;

/**
 *
 * @author Rabia
 */
public class BedenKitleIneksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***** Beden Kitle İndeksinizi Ölçmeye Hoş Geldiniz *****");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz... : ");
        int kilo = scanner.nextInt();
        System.out.println("Boyunuzu giriniz (ornek: 1.67)...: ");
        double boy = scanner.nextDouble();
        
        double bki = kilo / ( boy * boy );
        
        System.out.println("Beden kitle indeksiniz: " + bki + "dir...");
        if (bki < 18)
            System.out.println("Zayıfsınız... ");
        else if (bki < 25)
            System.out.println("Nomal kilolusunuz...");
        else if (bki < 40)
            System.out.println("Üzgünüz fazla kilolusunuz...");
        else if (bki > 40)
            System.out.println("Aşırı kilolusunuz...");
        else 
            System.out.println("sonucun 12 ile 40+  arası bir değer olması gerekiyor. Yanlış tuşlama yaptınız... ");
         
        System.out.println("..... Sağlıklı günler dileriz .....");
        
    }
    
}
//dik üçgenin hipotenisini bulma
//İki sayının değerini değiştirme
//kilometreye göre ödenecek tutarı bulma
//girilen 3 sayıdan büyüğünü bulma
//basit hesap makinesi yapma
//not hesaplama
//atm programı

