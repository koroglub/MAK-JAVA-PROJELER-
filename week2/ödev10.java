/*
 *Adım1:Başla
 *Adım2:Harita uzunluğunu gir;HU
 *Adım3:Gerçek uzunluğu gir ; GU
 *Adım4:Ölçeği hesapla; HU/GU
 *Adım5:Dur
/**
 *
 * @author casper
 */
import java.util.Scanner;
public class ödev10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Harita uzunluğunu giriniz");
        double HU = input.nextDouble();
        System.out.println("Lütfen gerçek uzunluğu giriniz");
        double GU= input.nextDouble();
        double ölçek = HU/GU;
        System.out.println("ölçek" + ölçek);
    }
    
}
