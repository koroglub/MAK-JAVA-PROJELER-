/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bahar
 */
import java.util.Scanner;
public class ödev4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("lütfen bir sayı gir");
       int a = input.nextInt();
       System.out.println("iinci sayıyı gir");
       int b = input.nextInt();
       System.out.println("üçüncü sayıyı gir");
       int c = input.nextInt();
       if(a>b && a>c)
       {
           System.out.println( a +" en büyük sayı");
       }
       else if( c>b && c>a)
       {
           System.out.println(c+" en büyük sayı");
       }
       else if(b>a && b>c)
       {
        System.out.println(b+" en büyük sayı");
       }
      
        else{
       System.out.println("koşulları sağlamıyor");
}
    
    }       
}
