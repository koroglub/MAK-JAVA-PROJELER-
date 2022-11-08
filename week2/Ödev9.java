/*
 *Adım1: Başla
 *Adım2: Mutlak nemi  gir;a
 *Adım3: Maksimum nemi gir;b
 *Adım4: Bağıl nemi hesapla ; a/b * 100
 *Adım5: Dur

/**
 *
 * @author casper
 */
import java.util.Scanner;
public class Ödev9 {

  
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.println("Mutlak nemi giriniz");
       double a = input.nextDouble();
       System.out.println("Lütfen maksimum nemi giriniz");
       double b = input.nextDouble();
       double Bağılnem = (a/b)*100;
       System.out.println("Bağılnem" + Bağılnem);
       
    }
    
}
