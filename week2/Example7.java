/*
 *Adım1: Başla
 *Adım2: Maddenin kütlesini giriniz;m
 *Adım3: Maddenin hızını giriniz; v
 *Adım4: Maddenin kinetik enerjisini hesapla;1/2*m*v^2
 *Adım5: Maddenin yüksekliği giriniz:h
 *Adım6: Maddenin potansiyel enerjisini hesapla;m*g*h
 *Adım7: Dur

/**
 *
 * @author casper
 */
import java.util.Scanner;
public class Example7 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Maddenin kütlesini giriniz");
        double m = input.nextDouble();
        System.out.println("Lütfen maddenin hızını giriniz");
        double v = input.nextDouble();
        System.out.println("Lütfen maddenin yüksekliğini giriniz");
        double h= input.nextDouble();
        double kinetikenerji = (m*v*v)/2;
        
        double potansiyelenerji = (m*10*h);
        System.out.println("kinetikenerji" + kinetikenerji + "potansiyelenerji" + potansiyelenerji);
        
        
    }
    
}
