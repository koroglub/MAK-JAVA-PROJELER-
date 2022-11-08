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
public class Homework5 {

  
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("a kenarını gir");
     int a = input.nextInt();
     System.out.println("b kenarını gir");
     int b = input.nextInt();
     System.out.println("c kenarını gir");
     int c = input.nextInt();
     if(a==b & a==c & c==b)
     {
         System.out.println("eşkenar üçgen");
     }
     else if(a==b || a==c || c==b)
     {
         System.out.println("ikizkenar üçgen");
     }
     else
     {
         System.out.println("çeşitkenar üçgen");
     }
    }
    
}
