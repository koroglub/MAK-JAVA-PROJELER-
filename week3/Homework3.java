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
public class Homework3 {

       public static void main(String[] args) {
           Scanner input = new Scanner (System.in);
           System.out.println("sayı giriniz");
           int sayi= input.nextInt();
           if(sayi>0)
           {
               System.out.println("pozitif");
           }
           if(sayi<0)
           {
               System.out.println("negatif");
           }
           if(sayi==0)
           {
               System.out.println("0");
           }
    }
    
}
