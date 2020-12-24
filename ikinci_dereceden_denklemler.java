/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest1;
import java.util.Scanner;
/**
 *
 * @author Rabia
 */
public class JavaTest1 {

    /**
     * @param args the command line arguments
     */
    // Bu algoritma girilen ax^2+bx+c türünden denklemleri çözer.
    public static void main(String[] args) {
        System.out.println("ax^2+bx+c için a b c değerlerini sırasıyla giriniz: ");
        Scanner in = new Scanner(System.in);

        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();

        System.out.println("Denklem : " + a + "x^2+" + b + "x+" + c);

        float delta = b * b - 4 * a * c;

        if (delta < 0){
            float kok_real = -b / 2 * a;
            float kok1_imaj = (float)(Math.sqrt(-delta)/ 2 * a) ;
            float kok2_imaj = -kok1_imaj;


            System.out.println("Delta sıfırdan küçük olduğundan kök karmaşıktır");
            System.out.println("Birinci kök: " + kok_real + "+i" + kok1_imaj);
            System.out.println("ikinci kök: " + kok_real + "+i" + kok2_imaj);

        }
        else if(delta == 0 ){
            float kok = - b / (2 * a);
            System.out.println("Delta sıfır olduğundan çakışık kök vardır.");
            System.out.println("Kök: " + kok);
        }
        else{
            float kok1 = (float) ((- b + Math.sqrt(delta)) / 2 * a);
            float kok2 = (float) ((- b - Math.sqrt(delta)) / 2 * a);
            System.out.println("Delta sıfırdan büyük olduğundan. Denklemin iki farklı kökü vardır.");
            System.out.println("Kök1: " + kok1 + "\nKök2: " + kok2);
        }
    }
}
