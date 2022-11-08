
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahar
 */
public class example2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int vize;
        int fnl;
        double ort;
        do {            
            System.out.println("vize notunu giriniz:");
            vize = input.nextInt();
            System.out.println("fnl notunu giriniz:");
            fnl= input.nextInt();
       
            ort = vize *0.4+ fnl * 0.6;
        } while (vize < 0 || vize >100 || fnl <0 || fnl>100);
        if (ort<= 100 && ort >=80) {
            System.out.println("not: A " + ort);
            
        }
        else if (ort<=79 && ort>=60) {
            System.out.println("not:B " + ort);
            
        }
        else if (ort<=59 && ort >= 50 + ort) {
            System.out.println("not:C "+ ort);
            
        }
        else  {
            
            System.out.println("not:D " + ort);
            
        }
        
    }
    
    
}
