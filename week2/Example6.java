/*
 *Adım1:Başla
 *Adım2:iletkenin direncini giriniz;r
 *Adım3:İletkenin akımını giriniz;ı
 *Adım4:Gerilimi hesapla; r*ı
 *Adım5:Dur

/**
 *
 * @author casper
 */
import java.util.Scanner;
public class Example6 {
   
   
    public static void main(String[] args) {
         Scanner input = new Scanner ( System.in);
        System.out.println("İletkenin direncine giriniz");
        Double r = input.nextDouble();
        System.out.println("iletkenin akımını giriniz");
        Double ı = input.nextDouble();
        Double gerilim = r*ı;
        System.out.println("gerilim" + gerilim);
       
       
        
    }
    
}
