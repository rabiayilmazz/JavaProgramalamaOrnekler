import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Rabia
 */
public class Yeni {
public static void main(String[] args) {
        int sonuc=0;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Bir Sayı Girin: ");
        int sayi = reader.nextInt();
        if(sayi>0){
             for(int i=2;i<=sayi;i++){
                 if(sayi%i==0){
                     sonuc = sayi/i;
                 break;
                 } 
             }
             System.out.println("sonuc: " + sonuc);
         }
         else {
         System.out.println("Yanlış tuşlama yaptınız...");
         }   
    
}
}
