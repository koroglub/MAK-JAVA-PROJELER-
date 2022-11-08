/*
 *Adım1:Başla 
 *Adım2:Taban uzunluğunu al; a
 *Adım3:taban uzunluğuna ait yüksekliğini al;b
 *Adım4:Sayıların çarpımını hesapla: a*b
 *Adım5:Sayıların çarpımını 2'ye böl:(a*b)/2
 *Adım6:Dur

/**
 *
 * @author casper
 */
import java.util.Scanner;
public class Example4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Taban uzunluğunu giriniz");
        int a = input.nextInt();
        System.out.println("Taban uzunluğuna ait yüksekliği giriniz");
        int b = input.nextInt();
        int çarpım = a*b /2;
        System.out.println("çarpım:" + çarpım);
        
      
    }
    
}
