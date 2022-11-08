/*
 * Adım1:Başla
 * Adım2:Kürenin yarı çapını giriniz; r
 * Adım3:Kürenin hacmini hesapla; 4/3*π*r^3
 * Adım4:kürenin alanını hesapla; 4*π*r^2
 * Adım5:Dur

/**
 *
 * @author casper
 */
import java.util.Scanner;
public class Example5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        System.out.println("Kürenin yarı çapını giriniz");
       
        double yarıçap = input.nextDouble();
        double hacim = (4*3.14*(yarıçap*yarıçap*yarıçap))/3;
        double alan = 4*3.14*yarıçap*yarıçap;
        System.out.println("hacim" +hacim + "alan" + alan );
        
               
       
    }
    
}
