
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
public class Homework5 {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("metre cinsinden bir sayı giriniz:");
        double m = input.nextDouble();
        System.out.println("istediğiniz birimi girin  , birimler: 1=dm,2=cm,3=mm,4=km");
        double sonuç = input.nextDouble();
        double b =0;
       
        if(sonuç == 1)
        {
        b= m*10;
            System.out.println("dm:"+b);
            
        }
        else if( sonuç == 2)
        {
        b= m*100;
            System.out.println("cm:"+b);
           
        }
        else if( sonuç == 3)
        {
        b = m*100;
            System.out.println("mm:" +b);
           
        }
        else if(sonuç==4)
        {
        b = m/1000;
            System.out.println("km:"+b);
            
        }
        
        
    } 
    
}
