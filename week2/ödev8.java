/*Adım1: Başla
 *Adım2: A dersinin birinci sınav notunu gir;a
 *Adım3: A dersinin ikinci sınav notunu gir;b
 *Adım4: B dersinin birinci sınav notunu gir;c
 *Adım5: B dersinin ikinci sınav notunu gir; d
 *Adım6: C dersinin birinci  sınav notunu gir;e
 *Adım7: C dersinin ikinci sınav notunu gir;f
 *Adım8: D dersinin birinci sınav notunu gir;g
 *Adım9: D dersinn ikinci sınav notunu gir;h
 *Adım10: Dur
*/
import java.util.Scanner;
public class ödev8 {
    

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A dersinin birinci sınav notu");
        double a = input.nextDouble();
        System.out.println("Adersinin ikinci sınav notu");
        double b = input.nextDouble();
        System.out.println("B dersinin birinci sınav notu");
        double c = input.nextDouble();
        System.out.println("B dersinin ikinci sınav notu");
        double d = input.nextDouble();
        System.out.println("C dersinin birinci sınav notu");
        double e= input.nextDouble();
        System.out.println("C dersinin ikinci sınav notu");
        double f= input.nextDouble();
        System.out.println("D dersinin birinci  notu");
        double g =  input.nextDouble();
        System.out.println("D dersinin ikinci notu");
        double h= input.nextDouble();
        double A = (a + b)/2;
        double B = (c + d)/2;
        double C = (e + f)/2;
        double D = ( g+ h)/2;
        System.out.println("A" +A + "B" + B + "C" + C + "D" + D );
        
       
        
        
     
    }
    
}
